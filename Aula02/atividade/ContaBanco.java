public class ContaBanco {
    private double saldo;
    
    public ContaBanco(double saldo_inicial){
        this.saldo = saldo_inicial;
    }

    //Realizar um depósito
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        }else{
            System.out.println("O valor do depósito deve ser positivo");
        }   
    }

    //Exibir saldo 
    public void mostrarSaldo(){
            System.out.println("Saldo atual: R$" + saldo);
    }
}
