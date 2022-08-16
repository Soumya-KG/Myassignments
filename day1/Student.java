package week1.day1;

public class Student {
	
	String name="Soumya";
	int rollNo=1234;
	String collegeName="SVES";
	int markScored=100;
	float ccpa=123.4f;
	
	public void name(String name) {
		System.out.println(name);
	}
	
	public void rollNo(int nr) {
		System.out.println(rollNo);
	}
	
	public void collegeName(String colname) {
		System.out.println(collegeName);
	}
	
	public void markScored(int mks) {
		System.out.println(markScored);
	}
	
	public void ccpa(float no) {
		System.out.println(ccpa);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.name("Soumya");
		obj.ccpa(123.4f);
		obj.collegeName("SVES");
		obj.rollNo(1234);
		
		
		
		
		
		

	}

}
