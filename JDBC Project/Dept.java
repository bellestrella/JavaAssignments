
// Add getters & setters
// Add parameterized constructors 

public class Dept {
	int deptNo;
	String deptName;
	String deptLoc;
	
	
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dept(int deptNo, String deptName, String deptLoc) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}
	
	
}
