package myProject26;
import java.util.Scanner;

public class CalculatingLeastCommonMultipleAndGreatestCommonDivisor {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int n1,n2,LCM=1,GCD=1,counter1=1,counter2=1,small;
		System.out.print("Please enter first number:");
		n1=input.nextInt();
		System.out.print("Please enter second number:");
		n2=input.nextInt();
		if(n1>n2) {
			small=n2;
		
          }
		else {
			small=n1;
		}
		while(counter1<=n1*n2) {
			if(counter1%n1==0&&counter1%n2==0) {
				LCM=counter1;
				System.out.println("The least common multiple of numbers you entered:"+LCM);
				break;
			}
			counter1++;
			
		}counter2=small;
		while(counter2>=1) {
			if(n1%counter2==0&&n2%counter2==0) {
				GCD=counter2;
				System.out.println("The greatest common divisor of numbers you entered:"+GCD);
				break;
			}
			counter2--;
		}
		
				
			}
			
		}
		
	
		
	


