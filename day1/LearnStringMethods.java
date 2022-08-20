package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="Testleaf12";
		
		//length of String
		int length=word.length();
		System.out.println(length);
		
		//to convert String into character array
		char[]charArray=word.toCharArray();
		for (int i=0;i< charArray.length;i++) {
			System.out.println(charArray[i]);
		
			System.out.println();
			
			//To find the particular charecter based on the index
			char charAtIndex=word.charAt(2);
			System.out.println("To find the particular charecter based on the index");
			
			//to convert to uppercase
			String upperCase=word.toUpperCase();
			System.out.println(upperCase);
			
			//to convert to lowercase
			String lowerCase=word.toLowerCase();
			System.out.println(lowerCase);
			
			
			
		}

	}

}
