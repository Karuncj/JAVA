/*********************************************************************************************
 * FILE       :MatrixMultiplication.c
 *DESCRIPTION :Program to implement matrix multiplication
 *AUTHOR      :KARUN CHERY JAMES
 *DATE        :11/08/21
 *********************************************************************************************/
import java.util.*;

public class matrixMultiplication {
    public static void main (String [] args){
        int [][]mat1=new int [10][10];
        int [][]mat2=new int [10][10];
        int [][]mulMat=new int [10][10];
        int row1,col1,row2,col2;
        System.out.println("Enter the row1 and col1umn of matrix1");
        Scanner sc=new Scanner(System.in);
        row1=sc.nextInt();
        col1=sc.nextInt();

        System.out.println("Enter the row1 and col1umn of matrix2");
        row2=sc.nextInt();
        col2=sc.nextInt();
        
        //reading and printing
        printclass mat=new printclass();
        if(col1==row2){
            mat.read(mat1,row1,col1);
            mat.print(mat1,row1,col1);
            mat.read(mat2,row2,col2);
            mat.print(mat2,row2,col2);

            //matrix multiplication
            mat.mul(mat1,mat2,mulMat,row1,col2);
            mat.print(mulMat, row1, col1);
        }

            else{
            System.out.println("Matrix multiplication is not possible(col1!=row2)");
        }
        sc.close();
    }
}
class printclass{
    void read(int mat[][],int row1,int col1){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix elements:");
        for(i=0;i<row1;i++){
            for(j=0;j<col1;j++){
                System.out.print("Row["+i+"]"+"["+j+"]");
                mat[i][j]=sc.nextInt();
            }
        }
        
    }
    void print(int mat[][],int row1,int col1){
        int i,j;
        System.out.println("The matrix is:");
        for(i=0;i<row1;i++){
            for(j=0;j<col1;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    void mul(int mat1[][],int mat2[][],int mulMat[][],int row,int col){
        int i,j,k;

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mulMat[i][j]=0;
                for(k=0;k<col;k++){
                    mulMat[i][j]=mulMat[i][j]+mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("The matrix multiplication is:");
    }
}