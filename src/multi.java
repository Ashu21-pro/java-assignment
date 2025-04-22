import java.util.Scanner;
public class multi {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the rows of matrix A:");
	int rowsA=sc.nextInt();
	System.out.print("Enter the columns of matrix A:");
	int colsA=sc.nextInt();
	
	System.out.print("Enter the rows of matrix B:");
	int rowsB=sc.nextInt();
	System.out.print("Enter the columns of matrix B:");
	int colsB=sc.nextInt();
	
	if (colsA!=rowsB)
	{
		System.out.println("Matrix mult is not possible");
	}
	
	int[][]A=new int[rowsA][colsA];
	int[][]B=new int[rowsB][colsB];
	int[][]result =new int[rowsA][colsB];
	
	System.out.println("Enter the elemnets matrix in matrix A:\n ");
	
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsA;j++) {
				A[i][j]=sc.nextInt();
			}		
			}
			
	
	System.out.println("Enter the elemnets matrix in matrix B:\n ");
	
		for(int i=0;i<rowsB;i++) {
			for(int j=0;j<colsB;j++) {
				B[i][j]=sc.nextInt();
			}		
		}
			

		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsB;j++) {
				for(int k=0;k<colsA;k++) {
					result[i][j]+=A[i][k] * B[k][j];
				}
			}
		}
				
				
	System.out.println("Resultant matrix: ");
	
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsB;j++) {
				System.out.print (result [i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
	

	}
}
