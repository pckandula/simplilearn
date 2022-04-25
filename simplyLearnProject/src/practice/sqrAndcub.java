package practice;
import java.util.Scanner;

public class sqrAndcub {

	public static void main(String args[]) {
		int a;
		//creating scanner object.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find the squre and cube :");
		a=sc.nextInt();
		// creating object instance for suqureCube class which have squre and cube methods
		squreCube sq = new squreCube();
		System.out.println("the squre of the number you entered is :"+sq.sqr(a));
		System.out.println("the cube of the number you entered is :"+sq.cub(a));
		
	}
}
class   squreCube {
	public int sqr( int a) {
		return a*a;
	}
	public int cub( int a) {
		return a*a*a;
	}
}
