package Main;

public class Patterns {
	public static void main (String args[]) {
		OddEvenPatternOne();
		System.out.println();
		OddEvenPatternTwo();
		System.out.println();
		OddEvenPatternThree();
	}
	
	private static void OddEvenPatternOne() { //First pattern
		
		int k=5;//Max row
		
		for(int i = 1; i <= k; i++) {
			for(int j = 0; j < k-i; j++) {//Max length less number of iterations
				System.out.print("*");
			}
			for(int h = 1; h<=i; h++) {//Number of iterations increment with each iteration
				
				if(i%2==0) System.out.print("E");//Conditions
				else System.out.print("O");
			}
			System.out.println();
		}
	}
	
	
	private static void OddEvenPatternTwo() {// Second pattern
		
		int numRows=5;
		int numChars=6;
		
		for(int i=1 ; i<=numRows; i++) {
			for(int j=1 ; j<=numChars; j++) {
				if(i%2==0 && (j==1 || j==numChars)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
					
			}
		System.out.println();
		}
	}
	
	private static void OddEvenPatternThree() {// Third pattern
		
		int numRows=5;
		int numChars=6;
		
		for(int i=1 ; i<=numRows; i++) {
			for(int j=1 ; j<=numChars; j++) {
				if(i%2!=0 && (j%4==1 || j%4==2)){ //Sequence pattern 1
					System.out.print("O");
				}else if(i%2==0 && (j%4==3 || j%4==0)){//Sequence pattern 2
					System.out.print("E");
				}else{
					System.out.print("*");
				}
			}
		System.out.println();
		}
	}
	
	
}
