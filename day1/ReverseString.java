package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Sowmya";
		String rev="";
		//length of string
		System.out.println(rev);
		int length=word.length();
		System.out.println(length);
		
		//to convert String into Charecter Array
		//j is just reversing the charecters one by one backwards
		char[] charArray=word.toCharArray();
		for(int j=charArray.length-1;j>=0;j--) {
			rev=rev+charArray[j];
		}
		
		System.out.println("Original String:"+word);
		System.out.println("Reversed String:"+rev);

	}

}
