import java.util.Scanner;
public class Mark
{

public static void main(String[] args)
{
int n,sum=0;


Scanner s= new Scanner(System.in);
System.out.println("Enter no. of Subjects");
n=s.nextInt();

int m[] = new int[n];

System.out.println("Enter Marks:");
for(int i=0; i<n; i++)
{
 m[i] = s.nextInt();
 sum= sum+m[i];
}


System.out.println("Total="+sum);
int per = sum/n;
System.out.println("percentage="+per+"%");
}
}
