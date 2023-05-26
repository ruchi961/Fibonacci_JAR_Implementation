package fibo;
public class fibonacci{
public static void fibonacciPrintSeries(int len){
int i;
int no_1=0;
int no_2=1;
int sum;
System.out.print(no_1+" ");
System.out.print(no_2+" ");
for(i=0;i<(len-2);i++){

sum =no_1+no_2;
System.out.print(sum+" ");
no_1= no_2;
no_2 = sum;

}//for i end
}//fibonacciPrintSeries end

public static void main(String args[]){
fibonacciPrintSeries(3);
}//main end
}