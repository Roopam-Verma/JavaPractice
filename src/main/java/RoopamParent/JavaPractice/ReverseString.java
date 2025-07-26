package RoopamParent.JavaPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
	public void reverse() {
		System.out.println("reverse by using string builder");
		String name = "MyJavaPractice";
		System.out.println(name);
		
		StringBuilder newName = new StringBuilder();
		newName.append(name);
		
		newName= newName.reverse();
		System.out.println(newName);
	}

	@Test
	public void reverseSysinput() {
		System.out.println("reverse by using string builder but taking input on the go");
		System.out.println("Enter your string: ");
		StringBuilder str2 = new StringBuilder();
		try (Scanner userinput = new Scanner(System.in)) {
			String str = userinput.nextLine();
			
			str2.append(str);
			System.out.println(str2);
			
			System.out.println(str2.reverse());
			
		}
		
	}
	
	@Test
	public void reversewithoutStringBuilder() {
		System.out.println("Reverse without string builder object");
		String str1= "Newtothisworld";
		String[] token = str1.split("") ;
		System.out.println(token.length);
		String string2="";
		for(int i=token.length-1; i >= 0; i--) {			
			string2= string2+ token[i] ;	
		}
		System.out.println(string2);
		
	}

	
	@Test
	public void onemoreTimeWithUserinput() {
		System.out.println("onemoreTimeWithUserinput");
		System.out.println("Enter your string");
		Scanner myString = new Scanner(System.in);
		String a = myString.nextLine();
		System.out.println(a);
		String[] listed = a.split("");
		System.out.println(listed.length);
		String reversedStr = "";
		for (int i= listed.length-1; i>= 0; i--) {
			reversedStr = reversedStr+listed[i]; 
		}
		System.out.println(reversedStr);
	}
	
	
	@Test
	public void converttoArray() {
		String str = "a;b;c;d;e";
		String[] arr = str.split(";");
		
		for (int i= 0; i< arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
				
	}
	
}



