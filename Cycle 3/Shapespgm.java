class Shapes
{

   int area(int a)
   {
    return a*a;
   }
   double area(double a)
   {
    return 3.14*a*a;
   }
   int area(int a, int b)
   {
   return a*b;
   }

}
public class Shapespgm
{
 public static void main(String args[])
 {
  Shapes s = new Shapes();
   int x,l,b;
   double y;
    x=3;
    y=2.5;
    l=3;
    b=2;

  int sarea=s.area(x);
  System.out.println("square area :"+ sarea);

  double carea =s.area(y);
  System.out.println("circle area :"+ carea);

  int rarea = s.area(l,b);
  System.out.println("rectangle area :"+ rarea);
 }
}