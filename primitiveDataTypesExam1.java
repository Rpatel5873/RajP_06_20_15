package com.myownproject1;

public class primitiveDataTypesExam1 {

	public static void main(String[] args) {
		addition();	
		substraction();
		multiplication();
		
		relationalOperators();
	}
	
		public static void addition() {
			
						
			int number1 = 10; 
			int number2 = 20;
			
			int sum = number1 + number2;
			System.out.println("sum  =" + sum);
	}	
		
		public static void substraction() {
			
			
			double number1 = 10.5; 
			double number2 = 5.5;
			
			double substraction = number1 - number2;
			System.out.println("substraction = " + substraction);
	}
		
		public static void multiplication() {
			
	
			char number1 = 10; 
			char number2= 20;
			
			int multiplication = number1 * number2;
			System.out.println("char a  " + multiplication );
	
	}
	
		public static void relationalOperators() {
			
						
			int value1 = 10;
			int value2 = 20;
	
			
			if (value1 != value2) {
				
				System.out.println(value1!=value2);
			
			}
			
		}	
			
}

		
			