//L8E2
//this program .... needs a comment!
import java.util.Scanner;
public class Lab8E2{
	public static void main(String args[]) {
	

// the input/Scanner bit
	int sum=0, limit;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the upper limit: ");
	limit=input.nextInt();
	
// the processing bit
	for(int i=0; i<=limit;i++)
	{
		sum +=i; // sum=sum+1;
	}
// the Output bit
	System.out.println("The Sum of the first "+limit+" positive integers is:"+sum);
}
}