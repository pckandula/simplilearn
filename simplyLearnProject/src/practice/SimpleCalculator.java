package practice;
import java.util.Scanner;

public class SimpleCalculator {
	static int a,b,operand,result;
	public static void main(String[] args) {
		
		//int a,b,operand,result;
		Scanner sc = new Scanner(System.in);
		boolean isexit = false;
		while(!isexit)
		{
			System.out.println("enter the operation you want to perform"
					+ "\n1.addtion"
					+ "\n2.substraction"
					+ "\n3.multiplication"
					+ "\n4.division"
					+"\n5.stoptheprogram.");
			operand = sc.nextInt();
		System.out.println("enter the first number:");
		a= sc.nextInt();
		System.out.println("enter the second number:");
		b= sc.nextInt();
		
		switch(operand) {
		case 1:
				result = a+b;
				break;
		case 2:
				result = a-b;
				break;
		case 3:
				result = a*b;
				break;
		case 4 :
				result = a/b;
				break;
		case 5 :
			isexit = true;
			break;
					}
		System.out.println(result);
		}
	}

}
