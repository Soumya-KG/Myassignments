package week1.day2;

public class Calculator {
	
			
	
	
	public void add(int a, int b) {
		int c=(a+b);
		System.out.println(c);
		
		
	}
	public void sub(int d, int e) {	
     int f=(d-e);
     System.out.println(f);
     
	}
     
     public void mul(int s, int t) {
    int g=(s*t);
    System.out.println(g);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj=new Calculator();
		obj.add(1, 2);
		obj.sub(10, 8);
		obj.mul(1, 1);
		
		
		
	}

}
