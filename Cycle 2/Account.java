import java.util.*;

class Account
{
int accno;
String dname, acctype;
double amount,balance;
Scanner s = new Scanner(System.in);

public void getdata() 
{
System.out.println("\nenter the account number : ");
accno=s.nextInt();
System.out.println("enter the name of the depositor : ");
dname=s.next();
System.out.println("enter the type of the account : ");
acctype=s.next();
System.out.println("enter the balance amount : ");
balance=s.nextDouble();
}

public void deposit()
{
System.out.println("\naccount balance : "+balance);
System.out.println("\nenter the amount to be deposited : ");
amount=s.nextDouble();
if (amount>0) 
{
balance+=amount;
}
else
{
System.out.println("error: invalid amount!!!");
}
}

public void withdrawn()
{
System.out.println("\naccount balance : "+balance);
System.out.println("\nenter the amount to be withdrawn : ");
amount=s.nextDouble();
if (amount>0 && amount<balance)
{
balance-=amount;
}
else
{
System.out.println("error: insufficient balance/invalid amount!!!");
}
}

public void display()
{
System.out.println("\nname of the depositor : "+dname);
System.out.println("account type : "+acctype);
System.out.println("account balance : "+ balance);
}

public static void main(String args[])
{
int n=0;
Scanner s1 = new Scanner(System.in);
System.out.print("enter the limit : ");
n=s1.nextInt();
Account b[]=new Account[n];
for(int i=0; i<n; i++) 
{
b[i]=new Account();
b[i].getdata();
}
System.out.println("\n***ACCOUNT DETAILS***");
for(int i=0; i<n; i++) 
{
b[i].deposit();
b[i].withdrawn();
b[i].display();
}
}
}
