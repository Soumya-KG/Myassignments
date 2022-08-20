package week3day1Polymorphism;

//Overload concept with Same class and same method

public class Calculator {
	
	public void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("methond with 3 args:"+d);
	}
	public void add(int a,int b) {
		int c=(a+b);
		System.out.println("method with 2 args:"+c);
	}
	public void add(double c,int d) {
		double e=c+d;
		System.out.println("method with 1 double and 1 int:"+e);
	}
    public void add(double a, double b) {
    	double c=a+b;
    	System.out.println("method with 2 doubles:"+c);
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj=new Calculator();
				obj.add(1, 2);
				obj.add(3, 4);
				obj.add(5, 5);
				obj.add(1, 2, 3);
				obj.add(7, 7);
		
				
				
				
				
	}

}
