
public class fibnacci {

	public static void main(String[] args) {
		int n=10;
		int first=0; int second=1;
		System.out.println("the fibonacci for the 10 numberas are:\n");
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(first+"");
			int m=first+second;
			first=second;
			second=m;
			
		}
		

	}

}
