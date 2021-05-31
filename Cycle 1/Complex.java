
public  class Complex
{
int real;
int img;
public Complex(int real,int img)
{
this.real=real;
this.img=img;
}
public static Complex sum(Complex c1, Complex c2)
{
Complex temp = new Complex(0,0);

temp.real=c1.real+c2.real;
temp.img= c1.img+c2.img;
return temp;
}
public static void main(String[] args)
{
Complex c1= new Complex(5,4);
Complex c2= new Complex(3,2);
Complex temp= sum(c1,c2);
System.out.println("sum is:"+temp.real+"+"+temp.img+"i");
}
}