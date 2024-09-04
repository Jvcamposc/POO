public class ContaTest
{
 	public static void main(String[] args)
	{
	Conta novaconta = new Conta(12345, 1500.10, 500);
	Conta conta1 = new Conta(123456, 2900.80, 1500);

	System.out.printf("A conta de numero %d possui saldo %.2f \n", novaconta.getNumero(), novaconta.getSaldo());

	novaconta.sacar(300);
	System.out.printf("A conta de numero %d possui saldo %.2f \n", novaconta.getNumero(), novaconta.getSaldo());

	novaconta.sacar(600);
	System.out.printf("A conta de numero %d possui saldo %.2f \n", novaconta.getNumero(), novaconta.getSaldo());
	}
}