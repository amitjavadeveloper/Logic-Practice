import java.util.Scanner;

class FibonacciSeries2{

//0 1 1 2 3...so on

     public static void main(String[] args){

       int no1=0;
       int no2=1;
       int no3;
       int count;
       Scanner sc=new Scanner(System.in);
       System.out.print("Please Enter your no. : ");
       count=sc.nextInt();

       System.out.print(no1+" "+no2);

       for(int i=1;i<= count-2 ;i++){
           no3=no1+no2;
           System.out.print(" "+no3);
           no1=no2;
           no2=no3;

          }


      }



}