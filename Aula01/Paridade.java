import java.util.Scanner;

public class Paridade
{
	public static void main(String[] args)
	{
	 Scanner input = new Scanner(System.in);
	int num;

	System.out.println("Entre com um numero: ");
	num = input.nextInt();

	if(num%2==0){
	System.out.println("O numero %d e par.",num);	
	}else{ 
	System.out.println("O numero %d e ímpar.",num);
}
}