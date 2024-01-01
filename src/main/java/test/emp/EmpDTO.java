package test.emp;

public class EmpDTO {
	private String deptno;
	private String name;
	private String id;
	private String pass;
	private String addr;
	private int point;
	private String grade;
	
	public EmpDTO() {
		System.out.println("===================기본생성자=============================");
	}
	//update용
	public EmpDTO(String id, String pass, String addr, int point, String grade) {
		super();
		this.id = id;
		this.pass = pass;
		this.addr = addr;
		this.point = point;
		this.grade = grade;
		System.out.println("===================update=============================");
	}
	
	//insert용
	public EmpDTO(String deptno, String name, String id, String pass, String addr, String grade) {
		super();
		this.deptno = deptno;
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.addr = addr;
		this.grade = grade;
		System.out.println("===================insert=============================");
	}
	
	
	
	//select용
	public EmpDTO(String deptno, String name, String id, String pass, String addr, int point, String grade) {
		this(deptno, name, id, pass, addr, grade);
		this.point = point;
		System.out.println("===================select=============================");
	}
	@Override
	public String toString() {
		return "EmpDTO [deptno=" + deptno + ", name=" + name + ", id=" + id + ", pass=" + pass + ", addr=" + addr
				+ ", point=" + point + ", grade=" + grade + "]";
	}
	public String getDeptno() {
		System.out.println("getDeptno()=================================");
		return deptno;
	}
	public void setDeptno(String deptno) {
		System.out.println("setDeptno()=================================");
		this.deptno = deptno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
