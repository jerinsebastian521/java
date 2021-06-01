import java.util.Scanner;
public class Symmetric
{

public static void main(String[] args)
{


Scanner s = new Scanner(System.in);

System.out.println("enter size of row");
int r = s.nextInt();
System.out.println("enter size of colom");
int c = s.nextInt();
int m[][] = new int[r][c];

System.out.println("enter elements");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j] = s.nextInt();
}
}



if(r!= c)
{
System.out.println("not symmetric ");
}
else
{
boolean symmetric = true;
             
for (int i = 0; i < r; i++)
 {
 for (int j = 0; j < c; j++)
  {
  if(m[i][j] != m[j][i])
  {
   symmetric = false;
   break;
    }
    }
    }
             
  if(symmetric)
  {
  System.out.println(" matrix is symmetric");
  }
  else
  {
  System.out.println(" matrix is not symmetric");
  }
  }
}

 
}
