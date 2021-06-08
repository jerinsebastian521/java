import java.util.Scanner;

public class Product
{
int pcode;
int price;
String pname;


Product()
{
pcode=0;
pname=null;
price=0;
}


 
public static void calc(int x,int y,int z)
{
int p1=x;
int p2=y;
int p3=z;
if(p1<=p2&&p1<=p3)
{
System.out.println("lowest price:"+p1);
}
else if(p2<=p1&&p2<=p3)
{
System.out.println("lowest price:"+p2);
}
else
{
System.out.println("lowest price:"+p3);
}
}


public static void main(String args[])
{
Scanner s = new Scanner(System.in);
Product p1= new Product();
Product p2= new Product();
Product p3= new Product();

System.out.print("Enter the Product 1 Code : ");
p1.pcode =s.nextInt();
System.out.print("Enter the Product 1 Name : ");
p1.pname = s.next();
System.out.print("Enter the Product 1 Price : ");
p1.price=s.nextInt();
System.out.print("Enter the product 2 Code : ");
p2.pcode =s.nextInt();
System.out.print("Enter the Product 2 Name : ");
p2.pname = s.next();
System.out.print("Enter the Product 2 Price : ");
p2.price = s.nextInt();
System.out.print("Enter the Product 3 Code : ");
p3.pcode =s.nextInt();
System.out.print("Enter the Product 3 Name : ");
p3.pname = s.next();
System.out.print("Enter the Product 3 Price : ");
p3.price = s.nextInt();
Product.calc(p1.price,p2.price,p3.price);
}
}