import java.util.Scanner;
public class Main
{
	public static void main(String [] args) {

	    int Number;
	    Scanner imput = new Scanner(System.in);
	    System.out.println("???FizzBuzz???");
	    Number=imput.nextInt();
	    if (Number<0){
	        Number=-Number;
	    }
	    if (Number % 5==0 && Number % 3==0){
	        System.out.println("FizzBuzz");
	    }
	    else if(Number % 5==0){
	        System.out.println("Buzz");
	    }
	    else if(Number % 3==0){
	        System.out.println("Fizz");
	    }
}
}