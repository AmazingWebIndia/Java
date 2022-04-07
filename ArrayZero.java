import java.io.*;
import java.util.*;
class ArrayZero
{
	
	public static void main(String args[])throws IOException
	{ int i,j;
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int num[][]=new int[4][4];
		System.out.println("Enter the values in Array");
		for( i=0;i<4;i++)
		{
			for( j=0;j<4;j++)
			{
				//num[i][j]=Integer.parseInt(br.readLine());
				num[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<4;i++)
		{
			for( j=0;j<4;j++)
			{
				if(i==j)
					num[i][j]=0;
			}
		}
		System.out.println("The Elements of 4*4 matrix with left diagonal elements as zeros");
		for(i=0;i<4;i++)
		{
			for( j=0;j<4;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
}