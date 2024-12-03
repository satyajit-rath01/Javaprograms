package Programpractice;

public class CheckPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int OriginalNumber = 121;
		int ReversedNumber = 0;
		int number = OriginalNumber;
		
		while(number!=0) {
			
			int digit = number % 10;
			ReversedNumber = ReversedNumber * 10 + digit;
			number = number/10;
			//System.out.println(ReversedNumber);
		}
		if (ReversedNumber == OriginalNumber) {
			
			System.out.println("The entered number is Pallindrome number");
		}else {
			
			System.out.println("The enetered number is not a Pallindrome number");
		}

	}

}
