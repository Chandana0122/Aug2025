package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_test {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/aug2024";
		String user = "root";
		String password = "system";
		
		try (Connection con = DriverManager.getConnection(url,user,password))
		{
			System.out.println("connect to DB");
			String insertsql = "INSERT INTO student(id,name,age) VALUES(?,?,?)";
			try(PreparedStatement ps = con.prepareStatement(insertsql))
			{
				ps.setInt(1, 105);
				ps.setString(2, "appu");
				ps.setInt(3, 22);
				int rows = ps.executeUpdate();
				System.out.println("Inserted : " + rows);
			}
			
			
		
		catch(SQLException e) {
			e.printStackTrace();
		}
			
			
			String readsql= "SELECT * FROM student";
			try(Statement stmt = con.createStatement())
			{
				ResultSet rs = stmt.executeQuery(readsql);
				while(rs.next()) {
					System.out.println("id: " + rs.getInt("id"));
					System.out.println("name: " + rs.getString("name"));
					System.out.println("age: " + rs.getInt("age"));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			String updatesql="UPDATE student SET name=? WHERE id=?";
			
			try(PreparedStatement pstmt1=con.prepareStatement(updatesql))
			{
				pstmt1.setString(1, "deepa");
				pstmt1.setInt(2, 102);
				int rows=pstmt1.executeUpdate();
				System.out.println("Updated:"+rows);
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			String deletesql="DELETE FROM student WHERE id=?";
			
			try(PreparedStatement pstmt2=con.prepareStatement(deletesql))
			{
			
				pstmt2.setInt(1, 101);
				int rows=pstmt2.executeUpdate();
				System.out.println("Delete:"+rows);
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}

		
		
		}
	}

