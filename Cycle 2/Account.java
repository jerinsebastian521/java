import java.util.*;
class Account
{
  int no;
  String name;
  String type;
  int bal ;
Account()
{
int no = 1;
String name ="x";
String type ="savings";
int bal = 0;
}

Scanner s = new Scanner(System.in);
void details()
{
System.out.print("Enter name: ");
name=s.nextLine();
System.out.println("Balance:"+bal);
}
void deposit(int amount)
{
bal = bal+amount;
}
void withdraw(int amount)
{
bal=bal-amount;
}
void check()
{
System.out.println("Balance:"+bal);
}
public static void main(String[]  args)
{
int amount;
Scanner s = new Scanner(System.in);
Account ac = new Account();
ac.details();

System.out.print("Enter amount to deposit:");
amount=s.nextInt();
ac.deposit(amount);
ac.check();



System.out.print("Enter amount to withdraw: ");
amount=s.nextInt();
if(amount<ac.bal)
{
ac.withdraw(amount);
}
else
{
System.out.println("Insufficient Balance,available:"+ac.bal);
System.out.print("Enter amount to withdraw: ");
amount=s.nextInt();
ac.withdraw(amount);
}
System.out.println("Name:"+ac.name);
ac.check();

}
}