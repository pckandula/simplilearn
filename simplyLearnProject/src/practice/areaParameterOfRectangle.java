package practice;
import java.util.Scanner;

public class areaParameterOfRectangle {
	public static void main(String[] args) {
		int s1,s2,area,parameter;
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("enter teh sides of the rectangle :");
		// taking the inputs of sides of the triangle.
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		//creating the object of this class for calling the methods we defined.
		areaParameterOfRectangle obj = new areaParameterOfRectangle();
		System.out.println("area of the given rectangle is :"+ obj.area(s1, s2));
		System.out.println("parameter of the given rectangle is :"+ obj.parameter(s1, s2));
	}
	int area(int s1, int s2) {
		return s1*s2;
	}
	int parameter(int s1, int s2) {
		return 2*(s1+s2);
	}

}
