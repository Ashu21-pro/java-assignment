import java.util.Scanner;
public class per {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the marks of sub 1:\n");
		int sub1=sc.nextInt();
		
		System.out.println("Enter the marks of sub 2:\n");
		int sub2=sc.nextInt();
		
		if(sub1>=35 && sub2>=35)
		{
			System.out.println("candidate has passsed");
		
		}
		else
		{
			System.out.println("candidate has failed.");
	}
sc.close();
}
}
