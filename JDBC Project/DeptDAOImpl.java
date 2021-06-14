import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {
	
	@Override
	public void printMenu() {
		System.out.println("Choose an Option");
		System.out.println("1. List a deprtment");
		System.out.println("2. Add a deprtment");
		System.out.println("3. Update a deprtment");
		System.out.println("4. Delete a deprtment");
		System.out.println("5. Insert using StoredProcedure");	
	}
	
	@Override
	// This should return an array list
	public List<Dept> getAllDepartments() {
		String QUERY = "select deptno,dname,loc from dept";
		List<Dept> deptList = new ArrayList();
		Dept dept = null;//  This is going to hold the departments 
		
		try(Connection con = ConnectionUtil.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY)) //Try with Resources
		{	
			while(rs.next()){
				int no = rs.getInt("deptno");
				String name = rs.getString("dname");
				String location = rs.getString("loc");
				//System.out.println("Connection");
				//System.out.println(no + "," +name+ "," +location );
				dept = new Dept(no, name, location);				// Parameterized cont needed
				deptList.add(dept);
			}//try
		} catch (SQLException e) {e.printStackTrace(); }
		return deptList;
	}

	@Override
	public void rowInsert() {
		String QUERY = "insert into dept values(80, 'Marketing', 'Reston')";
		// Create a new connection
		try(Connection con = ConnectionUtil.getConnection();
				Statement stmt = con.createStatement())
		// execute update method returns int type of value
		{ int result = stmt.executeUpdate(QUERY);
		System.out.println(" Result is :"+result);
		if (result==1) 
			System.out.println(" Data Inserted");
		else
			System.out.println(" Issue in data insertion ");
		} catch (SQLException e) {e.printStackTrace(); }
	}

	@Override
	public int rowUpdate() {
		int row=0;
		// ? is of value integer type
		String QUERY = "UPDATE dept SET dname='IT83' WHERE deptno=?";
		try (Connection conn = ConnectionUtil.getConnection();
				java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY))
		// The question mark will be replaced with 80
		// prepared statement will compile the query ahead of time
		{	preparedStatement.setInt(1, 80);
		row = preparedStatement.executeUpdate();
		// rows affected
		System.out.println(row);

		}catch( SQLException e)
		{
			System.out.println(" Row cannot be updated");
		}
		return row;
	}

	@Override
	public int rowDelete() {
		int row = 0;
		String QUERY = "Delete from dept where deptno = ?";
		try (Connection conn = ConnectionUtil.getConnection();
				java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
		{		
			preparedStatement.setInt(1, 80);
			row = preparedStatement.executeUpdate();
			// rows affected
			System.out.println(row);

		}catch( SQLException e)
		{
			System.out.println(" Row cannot be deleted");
		}
		return row;
	}

	@Override
	public void insertUsingProcedure() {
		try (Connection conn = ConnectionUtil.getConnection();
				CallableStatement stmt=conn.prepareCall("{call INSERTROWS(?,?,?)}"))
		{	 stmt.setInt(1,77);  
		stmt.setString(2,"dept77");  
		stmt.setString(3,"loc77");
		stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
