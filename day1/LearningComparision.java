package week3.day1;

public class LearningComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="Testleaf# 12";
		String word2="Testleaf# 12";
		
		//str object comparision
		String str=new String("Testleaf");
		String str1=new String("Teastleaf");
		System.out.println("String with new keyword comparision using operator");
		System.out.println();
		
		//literal comparision
		System.out.println(word==word2);
		boolean strequals=word.equals(word2);
		System.out.println(strequals);
		
		
		if(word.equals(word2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		//this is to ignore case sensitivity
		if(word.equalsIgnoreCase(word2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
			
		}

	}

}
