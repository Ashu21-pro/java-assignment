
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:\n");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number\n");
		double num2=sc.nextDouble();
		System.out.print("Enter the operator:\n");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator)
		{
			case '+':
					result=num1+num2;
					System.out.println("Result\n"+result);
					break;
			case '-':
				result=num1-num2;
				System.out.println("Result\n"+result);
				break;
			case '*':
				result=num1*num2;
				System.out.println("Result\n"+result);
				break;
			case '/':
				if(num2!=0) {
					result=num1/num2;
					System.out.println("Result\n"+result);
				}
				else
				{
					System.out.println("Error..div by zero is not possible");
				}
				break;
				default:
					System.out.println("pls enter valid operator:");
				
		}
		sc.close();
	}
}