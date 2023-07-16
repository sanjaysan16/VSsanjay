package Lab1;

public class Stringhandling {
	 public static void main(String[]args) {
		 String str =new String("sanjay");
		 String str1 =new String("riddle");
		System.out.println(str.length());
		 System.out.println(str.concat("myworld"));
		 System.out.println(str.substring(1));
		 
		 System.out.println(str.contains("world"));
		 System.out.println(str.toLowerCase());
		 
		 
		 System.out.println(str.toUpperCase());
		 System.out.println(str1.toLowerCase());
		 System.out.println(str1.toUpperCase());
		 
		 
		 System.out.println(str.replace("myworld", "myluv"));
		 System.out.println(str.replace("sanjay","myjv"));
		 System.out.println(str.equals("sanjay"));
		 System.out.println(str.compareTo("h"));
		 
		 
	 }
	 

} 