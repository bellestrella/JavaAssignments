import java.util.List;

// Interface to declare methods but are defined in DeptDAOImpl
public interface DeptDAO {
	public void printMenu();
	public List<Dept> getAllDepartments();
	public void rowInsert();
	public int rowUpdate();
	public int rowDelete();
	public void insertUsingProcedure();
}
