package com.example.gz;

public class Message {
	private int variable = 5;
	public static int variable1 = 10; // variable for the class (static)
	public int variable2 = 15; // variable for the method in the class (non-static)
	
	public static void setMessage (String message) {
		System.out.println("The message comes from a class instance: "+message + " and the following variable belongs"
				+ " to the class: "+variable1);
	} 
	
	public void setMessage2 (String message) {
		System.out.println("The message comes from a method instance: "+message + " and the following variable belongs"
				+ " to the method (non-static): "+variable2);
		doSomething();
	} 
	
	private void doSomething() {
	  System.out.println("Method only accessible within this class and from a non-static method");
	  System.out.println("Variable only accessible within this class and from a non-static method: "+variable);
	}
	

}
