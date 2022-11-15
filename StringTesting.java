package com.java.project;
import java.util.Scanner;


public class StringTesting {
	
	public static void name () {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter the string 1");
		String a;
		a = scan.next();
		System.out.println("enter the string 2");
		String b;
		b = scan.next();
		
		String fullname =(a.concat(" "+b));
		System.out.println("your concat ="+fullname);
		System.out.println("fullname is empty :"+fullname.isEmpty());
		System.out.println("fullname length is ="+ fullname.length());
		System.out.println("i want a char 6  ="+ fullname.charAt(6));
	
		
		System.out.println("uppercase ="+fullname.toUpperCase());
       String upper ;
       upper = fullname.toUpperCase();
		System.out.println("lowercase ="+upper.toLowerCase());
		
		System.out.println("enter the replace char");
		String n;
		n= scan.next();
		String m;
		m =scan.next();
		
		System.out.println("replace char  ="+fullname.replaceFirst(n, m));
		
		System.out.println();
}
	
	public static void test () {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the department 1");
		String mech ;
		mech =sc.nextLine();
		System.out.println("enter the depratment 2");
		String cse ;
		cse = sc.nextLine();
		
		System.out.println("the two strings are equal is true or false :" +mech.equals(cse) );
		System.out.println("the ignorecase is :"+mech.equalsIgnoreCase(cse));
		System.out.println("the substring result :"+ cse.substring(0));
		System.out.println("the short name of the department 1 :"+mech.substring(0, 4));
		System.out.println("the contains ="+cse.contains(cse));
		System.out.println("the contentequal is :"+ mech.contentEquals(cse));    
	
		System.out.println("the end string");
	String end;
	end =sc.next();
		
		System.out.println("the dep name end with n :"+mech.endsWith(end));
		System.out.println("the matches with dep 2 is :"+cse.matches(end));
		System.out.println(" compareTo value ="+cse.compareTo(end));
		System.out.println(" comparetoignorecase ="+ cse.compareToIgnoreCase(end));
		
		
	}
		public static void next () {
			
			Scanner scn = new Scanner (System.in);
			System.out.println("enter the student name ");
			String name;
			name = scn.next();
			
			System.out.println("bytes value ="+name.getBytes());
			System.out.println("indexof :"+name.indexOf('k'));
			System.out.println("lastindexof :"+name.lastIndexOf('k'));
			System.out.println("intern :"+name.intern());
			System.out.println("replace :"+name.replace(name, "vijay"));
			System.out.println("replace all ;"+name.replaceAll("kumar", "balaji"));
			System.out.println("the name is starwith r :"+name.startsWith("ram"));
			System.out.println("tostring :"+name.toString());
			System.out.println("trim :"+name.trim());
			System.out.println("value of :"+ name.valueOf(true));
			System.out.println("codepointAt :"+name.codePointAt(3));
			System.out.println("codepointBefore :"+name.codePointBefore(3));
			System.out.println("codepointCount :"+name.codePointCount(1, 3));
		    System.out.println("hashcode value ="+name.hashCode());
		    
		  
		   System.out.println("end value");
		   int start =0;
		   String end;
		   end = scn.next();
		  System.out.println(name.endsWith(end)); 
		  System.out.println("enter the end value in int");
		  int End;
		  End=scn.nextInt();
		    String cha = new String(name);
			char[] cha1 = new char[256];
			cha.getChars(start, End, cha1, 0);
			System.out.println("your getchar value is = " + cha1);
			{

				System.out.println("Enter your copy char ");

				char[] valu2 = scn.nextLine().toCharArray();
				char[] ch = name.toCharArray();
				for (int n = 0; n < ch.length; n++) {
					System.out.println(ch[n]);
				}
				String result = name.copyValueOf(ch);

				System.out.println("Your copy value is= " + result);
				
				byte[] byt = name.getBytes();
				for (int i = 0; i < byt.length; i++) {
					System.out.println("your byte value is =" + byt[i]);
				}
			}
		}
	
	public static void main(String args[]) {
		
		//StringTesting.name();
		//StringTesting.test();
		StringTesting.next();
	}
				
}
	


