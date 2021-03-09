package comparable;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private String position;


	public Employee(int id, String name, String department, String position) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
	} //Generate Constructor using field
	
	@Override
    public int compareTo(Employee o) { 
        return this.name.compareTo(o.name); //정렬의 기준을 이름으로 정해줌
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", position=" + position + "]";
	}
    

    
}
 


