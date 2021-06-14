import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DAOMain {

	public static void main(String[] args) {
		
		// Interface reference holds the object of DAOImpl
		DeptDAO deptDAO = new DeptDAOImpl();
		int choice=0;
		List<Dept> deptList = new ArrayList();
		
		do {
			deptDAO.printMenu();
			
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
				case 1:{  
					deptList = deptDAO.getAllDepartments();	// Returns your array list
					// Print the arrayList using a for each
//					for(Dept dept: deptList) {
//						System.out.println(dept.getDeptName());
//					}
					deptList.stream()
					.forEach(dept -> System.out.println(dept.toString()));
					break;
				}
				
				// You will notice that this will also be inserted in your database in Oracle
				case 2:{	
					deptDAO.rowInsert();
					break;
				}
				case 3:{	
					int n = deptDAO.rowUpdate();
					System.out.println("Row updated");
					break;
				}
				case 4:{
					int n = deptDAO.rowDelete();
					System.out.println("Row deleted : "+n);
					break;
				}
	
				case 5: {
					deptDAO.insertUsingProcedure();
					System.out.println("Row inserted using procedure");
					break;
				}

			}
		} while(choice != 6);

	}

}
