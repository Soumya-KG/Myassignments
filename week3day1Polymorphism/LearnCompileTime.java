package week3day1Polymorphism;

public class LearnCompileTime {
	
	public void employee(int id) {
		System.out.println("EmpId:"+id);
	}

	public void employee(String empName, String companyName) {
		System.out.println("empName: "+empName + "company name:" +companyName);
	}
	
	public void employee(float salary) {
		System.out.println("Emp Salary:"+salary);
		
	}
	
	public void employee(String allowance) {
		System.out.println("Type of Allowance:"+allowance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LearnCompileTime overload=new LearnCompileTime();

          overload.employee(121);
          overload.employee(2345.6f);
          overload.employee("Soumya", "HCL");
          overload.employee(12312);
          
	}

}
