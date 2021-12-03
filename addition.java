
import java.util.Scanner;
class sum{
    int number1;
    int number2;
    public int add(int num1,int num2){
        int sum;
        sum=num1+num2;
        return sum;
    }
}
class addition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum;
        System.out.println("Enter the numbers:");
        sum add1=new sum();
        add1.number1=sc.nextInt();
        add1.number2=sc.nextInt();
        sum=add1.add(add1.number1,add1.number2);
        System.out.println("The sum="+sum);
       sc.close();
    }
}
