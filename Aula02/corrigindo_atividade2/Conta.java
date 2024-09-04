public class Conta
{
	private int numero;
	private double saldo, limite;

	public Conta(int numero, double saldo, double limite)
 	{
	this.numero = numero;
	this.saldo = saldo;
	this.limite = limite;
 	}

	public void setSaldo(double valor)
	{
 	this.saldo += valor;
	}

	public double getSaldo()
	{
	return this.saldo;
	}

	public void sacar(double valor)
	{
	if(valor <  this.limite)
	this.saldo -= valor;
	else
	System.out.println("Saldo insuficiente!");
    	}

	public void setNumero(int numero){
	this.numero = numero;
	}
	public int getNumero()
	{

	return this.numero;

	}
}