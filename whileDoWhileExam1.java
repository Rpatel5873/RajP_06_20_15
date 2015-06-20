package com.myownproject1;

	public class whileDoWhileExam1 {
	
		public static void main(String[] args) {
			
			refillMedsUsingWhile();
			refillMedsUsingDoWhile();
		}
	
	public static void refillMedsUsingWhile() {
			
			int counter = 10;
					
			while(counter < 3) {
				System.out.println("refillMeds(): counter is: " + counter);
				counter = counter+1;
			}
		}
		
		public static void refillMedsUsingDoWhile() {
			
			int counter = -2;
			
			do {
				System.out.println("refillMedsUsingDoWhile(): counter is: "+ counter);
				counter = counter+1;
			} while(counter <= 3);
		}	
	}
