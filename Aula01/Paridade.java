import java.util.Scanner;

public class Paridade
{
	public static void main(String[] args)
	{
	 Scanner input = new Scanner(System.in);
	int num;

	System.out.printf("Entre com um numero: ");
	num = input.nextInt();

	if(num%2==0){
	System.out.printf("O numero %d e par.",num);	
	}else{ 
	System.out.printf("O numero %d e ímpar.",num);
}
}
}