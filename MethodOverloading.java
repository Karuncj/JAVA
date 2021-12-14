import java.util.*;

public class MethodOverloading {
	public static void main(String[] args) {
		int length,breadth;
		float radius,base,height;
		Scanner sc=new Scanner(System.in);
		
		//Area of Triangle
		System.out.println("Enter the base and height of triangle");
		base=sc.nextFloat();
		height=sc.nextFloat();
		areas r1=new areas();
		r1.area(base,height);
		
		//Area of Rectangle
		System.out.println("Enter the length and breadth of rectangle");
		length=sc.nextInt();
		breadth=sc.nextInt();
		r1.area(length,breadth);
		
		
		//Area of circle
		System.out.println("Enter the radius of circle");
		radius=sc.nextFloat();
		r1.area(radius);
		sc.close();
	}
}
 class areas{
	void area(float base,float height ) {
		Float areaOfTriangle;
		areaOfTriangle=(base*height)/2;
		System.out.println("The area of Triangle="+areaOfTriangle);		
	}
	void area(int length,int breadth ) {
		int areaOfRect;
		areaOfRect=length*breadth;
		System.out.println("The area of Rectangle="+areaOfRect);		
	}
	void area(float radius) {
		double areaOfCircle;
		double PI=3.14;
		areaOfCircle=PI*radius*radius;
		System.out.println("The area of circle="+areaOfCircle);		
	}
}