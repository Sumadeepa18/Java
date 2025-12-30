import java.util.*;
public class Bankapplication {
	static String name,gender;
	static int age;
	static double balance;
	static String bank="SBI";
	static String branch="kadapa";
	public  static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter gender");
		gender=sc.next();
		System.out.println("enter age");
		age=sc.nextInt();
		if(age<18) {
			System.out.println("enter valid age");
			System.exit(0);
			
		}
		System.out.println("enter balance amount");
		balance=sc.nextDouble();
		System.out.println("enter 1 to withdraw");
		System.out.println("enter 2 to deposit");
		System.out.println("enter 3 to calculate interset");
		System.out.println("enter 4 to display");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:{
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter withdraw amount");
			double amount=sc1.nextDouble();
			balance=balance-amount;
			System.out.println("the balance amount after withdraw "+balance);
			break;
		}
		case 2:{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter deposit amount");
		double deposit=sc1.nextDouble();
		balance=balance+deposit;
		System.out.println("the balance amount after deposit "+balance);
		break;
			}
		case 3:{
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter principle");
			double p=sc.nextDouble();
			double interest=(p*3*9.5)/100;
			System.out.println("the interest is "+interest);
			break;
		}
		case 4:{
			System.out.println("the details are");
			System.out.println(name);
			System.out.println(gender);
			System.out.println(age);
			System.out.println(balance);
			System.out.println(bank);
			System.out.println(branch);
			break;
		}case 5:{
			System.out.println("enter a valid number");
		}
		}
	}

}
