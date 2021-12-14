/****************************************************************
 * file 		:Inheritane.java
 * Description	: Java classes Employee and Engineer.
 * 				  Engineer should inherit from Employee class 
 * Author		:Karun Chery James
 * Date			:10/12/2021
 ***************************************************************/
import java.util.*;
 class Employee{
	 void display(int BS,int HRA,int DA) {
		 System.out.println("The Basic Salary of engineer:"+BS);
		 System.out.println("The HRA of engineer:"+HRA);
		 System.out.println("The DA of engineer:"+DA);
	 }
	 void CalcSalary(int BS,int HRA,int DA) {
		 int Gross_Salary;
		 Gross_Salary=BS+(BS*DA/100)+(BS*HRA/100);
		 System.out.println("The gross salary is:"+Gross_Salary);
	 }
 }
 class engineer extends Employee{
	int basic_salary,HRA,DA,GS;
	 void getdata(){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Basic Salary of engineer");
		this.basic_salary=s1.nextInt();
		System.out.println("Enter the HRA of engineer:");
		this.HRA=s1.nextInt();
		System.out.println("Enter the DA of engineer:");
		this.DA=s1.nextInt();
		display(basic_salary, HRA, DA);
		CalcSalary(this.basic_salary,this.HRA,this.DA);
		s1.close();
	 }
 }

public class Inheritance {
	public static void main(String[] args) {
		engineer E1=new engineer();
		E1.getdata();
	}

}
