import java.util.Scanner;
 

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int num1,num2;
	public static int getChoice() {
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("4. Div");
		System.out.println("5. Exit");
		System.out.println("Enter you choice");
		int choice = sc.nextInt();
		return choice;
	}
	public static void add() {
		System.out.println("Enter two numbers to ADD");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		Add ad = new Add(num1,num2);
		System.out.println("The sum of "+ num1+ " and "+ num2+ " is " + ad.getSum());
	}
	public static void sub() {
		System.out.println("Enter two numbers to Subract");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		Sub sb = new Sub(num1,num2);
		System.out.println("The difference of "+ num1+ " and "+ num2+ " is " + sb.getDifference());
	}
	public static void mul() {
		System.out.println("Enter two numbers to Multiply");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		Mul ml = new Mul(num1,num2);
		System.out.println("The product of "+ num1+ " and "+ num2+ " is " + ml.getProduct());
	}
	public static void div() {
		System.out.println("Enter two numbers to Divide");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		Div dv = new Div(num1,num2);
		int ans = dv.getRatio();
		if(ans!=-1)
			System.out.println("The division value of "+ num1+ " and "+ num2+ " is " + dv.getRatio());
	}
	public static void main(String[] args) {
		int choice;
		do {
			choice = getChoice();
			if(choice ==1 )
				add();
			if(choice ==2)
				sub();
			if(choice ==3)
				mul();
			if(choice == 4)
				div();
		}while(choice<5 && choice>0);
		System.out.println("!--------Thank You---------!");
	}

}
