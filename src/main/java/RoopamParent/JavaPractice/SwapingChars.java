package RoopamParent.JavaPractice;

import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

public class SwapingChars {
	
	
//	@Test
//	public void swapmethod() {
//		Scanner inputs = new Scanner(System.in);
//		int val1 = inputs.nextInt();
//		int val2 = inputs.nextInt();
//		
//		System.out.println("Value of first number: " + val1 + "," + "Value of second number: " + val1 );
//		int temp = val1+val2;
//		
//		val1 = temp-val1;
//		val2 = temp-val2;
//		System.out.println("After swap Value of first number: " + val1 + "," + "After swap Value of second number: " + val2 );
//	}
//	
//	@Test
//	public void withoutusingthirdvariable() {
//		Scanner inputs = new Scanner(System.in);
//		System.out.println("Enter the numbers");
//		int val1 = inputs.nextInt();
//		int val2 = inputs.nextInt();
//		
//		val1 = val1+val2;
//		val2 = val1-val2;
//		val1 = val1-val2;
//		
//		System.out.println("val1: " +val1);
//		System.out.println("val2: " +val2);
//		
//	}
//	
//	@Test(groups = "Current Test")
//	public void createHashmap() {
//		HashMap<String , String> CapitalCities = new HashMap<>();
//		
//		CapitalCities.put("City1", "New York");
//		CapitalCities.put("City2", "Mumbai");
//		CapitalCities.put("City3", "Chicago");
//		
//		System.out.println(CapitalCities);
//		
//	}
//	
//	
	@Test
	public void countnumberofWordsinString() {
		String str = "I I have have have got this this this this";
		String[] words = str.split(" ");
		System.out.println(words.length);
		int len = words.length;
		HashMap<String , Integer> map = new HashMap<>();
		
		for (int i = 0; i< len; i++) {
//			System.out.println(map.containsKey(words[i]));
			if (map.containsKey(words[i])){
				int count = map.get(words[i]);
				count = count+1;
				map.put(words[i], count);			
			}
			else {
				map.put(words[i], 1);
			}
			
			
		}
		System.out.println(map);
		System.out.println(map.size());
		
		
		
		
		
	}
	
	

}
