import fibo.fibonacci;
import java.util.Scanner;

class callFibonacci{

public static void main(String[] args){
System.out.print("Enter the maximum number of numbers to generate in the fibonacci series: ");
Scanner in = new Scanner(System.in);
int numLength = in.nextInt();
fibonacci.fibonacciPrintSeries(numLength);
}//main end
}