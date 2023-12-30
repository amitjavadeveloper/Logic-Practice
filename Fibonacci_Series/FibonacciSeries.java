class FibonacciSeries{
// 0 1 1 2 3....upto 28 terms

public static void main(String[] args){

        int no1=0,no2=1,nextNo;
        
        System.out.print(no1+" "+no2);

        for(int i=1;i<=26;i++){
            nextNo=no1+no2;
            System.out.print(" "+nextNo);
            no1=no2;
            no2=nextNo;

         }
    }

}