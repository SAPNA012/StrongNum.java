package basicJava.org.com;
import java.util.*;
/* Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits 
 * is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
*/
public class StrongNum {

	
	public static int Factorial(int num){//these is factorial method to check the factorial of given number
		
		int fact=1;//these fact variable assigned the value 1 because if value is 0 than we multiply value and store in "fact" than the overall value is become 0; 
		
		for(int i=1;i<=num;i++) {//these for loop is run until value of "num" is equal or lesser than  value of i
			
			fact=fact*i;//fact=1 and i=1 than expression is: fact=1*1; 
		}
		
		return fact;
		
	}
	
	public static boolean StrongNumber(int n) {/*these method is used to check number is Strong or not and it return the sum =original number if it was a 
		strong number*/
		int sum=0;
		int OrignalNum=n;
		
		while(n>0) {
			int digit=n%10;  // Extract the last digit
			sum=sum+Factorial(digit);  // Add the factorial of the digit to the sum
			n/=10;         // Remove the last digit
			
			
		}
		return sum==OrignalNum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc=new Scanner(System.in);
	    System.out.println("Enter the numerical value:");
	    int n=Sc.nextInt();
	    if (StrongNumber(n)) {
	    	//in these conditional statement  it was call the "StrongNumber" method to  check the number is strong or not 
	    	
            System.out.println(n + " is a Strong number.");
        } else {
            System.out.println(n + " is not a Strong number.");
        }
	   Sc.close(); //here we close the sc object of scanner class
      
}
}	          

		
		
		
		
		
		
		
		
	


