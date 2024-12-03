package Programpractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "TESTE";
		String reverseWord = "";
		
		for(int i=word.length()-1; i>=0;i--) {
			
			reverseWord+=word.charAt(i);
			
			
			
		}
		System.out.println("The reverse of the enetered String is: "+reverseWord);
		

	}

}
