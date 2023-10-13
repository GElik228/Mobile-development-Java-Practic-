import java.util.Scanner;
public class Main
{
	public static void main(String [] args) {

	    int Number;
	    Scanner imput = new Scanner(System.in);
	    System.out.println("Напиши число, и я скажу чётное оно или нет.");
	    Number=imput.nextInt();
	    if (Number<0){
	        Number=-Number;
	    }
	    if (Number % 2==1){
	        System.out.println("Нечётное");
	    }
	    else{
	        System.out.println("Чётное");
	    }
}
}