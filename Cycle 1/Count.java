import java.util.Scanner;
public class Count
{

public static void main(String[] args)
{
int n,count=0,k;
Scanner s= new Scanner(System.in);


System.out.println("Enter the array size");
n=s.nextInt();
int a[] = new int[n];

for(int i=0; i<n; i++)
{

a[i]=s.nextInt();
}

System.out.println("Enter the number to count occur:");
k=s.nextInt();
System.out.println("Enter elements:");
for(int i=0;i<n;i++)
{
if(a[i]==k)
{
count++;
}
}
System.out.println("Number of occurance of "+k+":"+count);
}
}