import java.util.*;
class Employee
{

int eno,esalary;
String ename;

void getdata()
{
Scanner s1 = new  Scanner(System.in);
System.out.print("Enter employee ID:");
eno=s1.nextInt();
System.out.print("Enter employee name:");
ename=s1.next();
System.out.print("Enter employee salary:");
esalary=s1.nextInt();
}

void display()
{
System.out.println("Employee ID:"+eno);
System.out.println("Employee Name:"+ename);
System.out.println("Employee Salary:"+esalary);
}


public static void main(String[] args)
{

int n,i,no;
Scanner s = new  Scanner(System.in);
System.out.print("Enter no. of employee:");
n=s.nextInt();

Employee a[] = new Employee[n];
for(i=0;i<n;i++)
{
a[i]= new Employee();
a[i].getdata();
}

for(i=0;i<n;i++)
{
a[i] .display();
}

System.out.print("Enter ID to Search:"); 
no = s.nextInt();
for(i=0;i<n;i++)
{
       if(a[i].eno == no)
       {
       a[i].display();
       break;
       }
       
}

}
}

