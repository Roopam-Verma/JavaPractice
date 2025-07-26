package RoopamParent.JavaPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class findevenNumber {
//	@Test
//	public void findout(){
//		Scanner myNumber = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num = myNumber.nextInt();
//		
//		if(num%2 == 0) {
//			System.out.println("Number is even");
//		}
//		else {
//			System.out.println("Number is odd");
//		}
//	}
//	
//	@Test
//	public void findprime() {
//		Scanner myNum = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int num = myNum.nextInt();
//		
//		int i = num/2;
//		boolean isPrime = true;
//		for(int j=2; j<=i; j++) {
//			int temp = num%j;
//			if(temp == 0) {
//				isPrime = false;
//				break;
//			}
//			
//		}
//		if(isPrime == false) {
//			System.out.println(num +" is Not a Prime Number");
//		}
//		else {
//			System.out.println(num +" is a Prime Number");
//		}
//	}
//// Write a Java Program to find whether a string or number is palindrome or not.

//	@Test
	public void numberpalindrome() {
		
	
		Scanner myStr = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String  value = myStr.nextLine();
		System.out.println(value);
		
		StringBuilder newstr = new StringBuilder();
		newstr.append(value);
		newstr.reverse();
		String another = newstr.toString();
		System.out.println(newstr);
		if (value.equals(another)) {
			System.out.println("This is pali ");
			
		}
		else {
			System.out.println("This is not pali ");
		}
	
	}
	
	@Test
	public void fibbonaciSeries() {
		int i, j, temp;
		
		i=0;
		j=1;
		
		for(int k=0; k<=12; k++) {

			if (i==0) {
				System.out.println(i);
				System.out.println(j);
			}
			
			
			temp = i+j;
			System.out.println(temp);
			i=j;
			j=temp;
			
		}
		
	}
		

}
