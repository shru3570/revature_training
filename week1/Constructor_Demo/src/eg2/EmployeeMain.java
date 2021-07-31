package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(100,"Shruti");
		System.out.println("printing e1 :");
		e1.printEmployee();
		
		System.out.println("e1 id is : "+e1.getId());
		
		Employee e2=new Employee(100,"Shruti",23,"pune");
		System.out.println("printing e2 :");
		e2.printEmployee();
		

	}

}
