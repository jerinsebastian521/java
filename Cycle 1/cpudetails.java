import java.util.Scanner;
class Cpu
{
double price;
  class Processor
  {
   double cores;
   String manufacturer;
   
    double getcache()
    {
     return 4.3;
    }
  }

  protected class Ram
  {
   double memmory;
   String manufacturer;
   double getclockspeed()
   {
    return 5.5;
   }
  }
}

public class cpudetails
{
 public static void main(String[] args)
{

   Cpu c= new Cpu();
   Cpu.Processor p = c.new Processor();
   Cpu.Ram r = c.new Ram();

 System.out.println("processor cache:"+p.getcache());
 System.out.println("Ram clock speed:"+r.getclockspeed());
}
}
