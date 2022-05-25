package Question1;
import java.util.Scanner;
public class Main {

	
	
	public static String reversString(String input){
	//write the logic
		
		String a="";char ch;
		for(int i=input.length()-1;i>=0;i--) {
			
			ch= input.charAt(i);
			System.out.println(ch);
	        a+= ch;
	        System.out.println(a);
		}
		return a;
	}
	public static void main(String[] args ){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to reverse");
	String orignalString = sc.next();
	String s=orignalString;
	String result = reversString(s);
	System.out.println("Original String is :"+ s);
	System.out.println("Reversed String is :"+ result);
	}
	}


