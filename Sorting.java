/***********************************************************************************
 * FILE         :Sorting.java
 * DESCRIPTION  :TO IMPLEMENT SORTING USING FUNCTION IN JAVA 
 * DATE         : 1/12/21
 * AUTHOR       :KARUN CHERY JAMES
 ***********************************************************************************/
import java.util.*;
import java.util.Scanner;
class Sorting{
    public static void main(String [] args){
        int []array;
        int size;
        array=new int[10];
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
         size=sc.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The entered array is:");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        System.out.println("The sorted array is:");
        Sort bub=new Sort();
        bub.sorting(array,size);
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
     class Sort{
         void sorting(int array[],int size){
            int i,j,temp;
            for(i=0;i<size;i++){
                for(j=0;j<size-i-1;j++){
            if(array[j]>array[j+1]){
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                    }
                }
            }
        }
    }
