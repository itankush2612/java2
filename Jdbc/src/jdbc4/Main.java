package jdbc4;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class A {
	static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
		return connection;

	}
}


class GetData extends A{
	static void getData() throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement("select * from emp");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			double contact = resultSet.getDouble("contact");
			System.out.println(id+ "  "+ name+"  "+contact);
		}
		getConnection().close();
	}
}

class InsertData extends A{
	static void insertData() throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement("insert into emp value (?,?,?)");
		preparedStatement.setString(1, "harry");
		preparedStatement.setInt(2, 1);
		preparedStatement.setDouble(3, 16586);
		preparedStatement.executeUpdate();
		System.out.println("successfull...");
	}
}

class DeleteData extends A{
	static void deleteData() throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement("delete from emp where id = ?");
		preparedStatement.setInt(1, 1);
		preparedStatement.executeUpdate();
		System.out.println("successfull...");
	}
}

class UpdateData extends A{
	static void updateData() throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement("update emp set name=? where id=?");
		preparedStatement.setString(1, "jerry");
		preparedStatement.setInt(2, 1);
		preparedStatement.executeUpdate();
		System.out.println("successfull...");
	}
}

//class CheckPass{
//	void authenticate() {
//		
//	}
//}

public class Main extends A{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertData.insertData();
		UpdateData.updateData();
	    DeleteData.deleteData();
		
		GetData.getData();
	}
}