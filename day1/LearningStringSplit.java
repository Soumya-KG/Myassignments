package week3.day1;

public class LearningStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//split based on delimiter--->
		
		String word="I am learning java in testleaf";
		String[] split=word.split(" ");
		for (int i=0;i<split.length; i++) {
			System.out.println(split[i]);
		}
		
		String s="Vidya12";
		//to print particulat sequence
		String substring=s.substring(2);
		System.out.println(substring);
		String substring2=s.substring(4,7);
		System.out.println(substring2);
		System.out.println(s.replace(2,3));

	}

}
