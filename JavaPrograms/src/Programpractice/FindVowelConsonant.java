package Programpractice;

public class FindVowelConsonant {

	public static void main(String[] args) {
		String name = "Satyajit Rath";
		
		int[] resarr = countVowelConsonant(name);
		System.out.println("Vowel: "+resarr[0]+" Consonant: "+resarr[1]);
//		for(int i: resarr) {
//			System.out.println(i);
//				
//		}
//		
	System.out.println("hello jee");
	for(int frequencyCount : resarr){
		System.out.println("vowel count : " + frequencyCount + " Consonant count : " + frequencyCount);
	}

	}
	
	public static int[] countVowelConsonant(String name) {
		int[] resultArray = new int[2];
		name = name.toLowerCase();
		int vowel = 0;
		int consonant = 0;
		for(int i=0; i<name.length();i++) {
			
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				vowel++;
			}
			else {
				consonant++;
			}
	}
		resultArray[0] = vowel;
		resultArray[1] = consonant;
		
		return resultArray;
		
	}
}
