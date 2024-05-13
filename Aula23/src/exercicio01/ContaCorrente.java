package exercicio01;

public class ContaCorrente extends ContaBancaria {

    private float chequeEspecial;

    public ContaCorrente(String nomeCliente, int numeroConta, float saldo, float chequeEspecial) {
        super(nomeCliente, numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    
    @Override
    public void sacar(float valor) throws Exception {

        if (valor > (saldo + chequeEspecial)) {

            throw new Exception("\n o valor do saque é maior que o disponivel.");
        }

        saldo -= valor;
        System.out.println("o valor R$" + valor + " foi sacado da conta " + numeroConta);
        
    }

    @Override
    public void exibirSaldo() { 

        System.out.println(" conta corrente n " + numeroConta);
        System.out.println("nome do cliente " + nomeCliente);
        System.out.println("saldo atual R$ " + saldo);
        System.out.println(" cheque especial " + chequeEspecial);
        System.out.println("total disponivel para saque: R$ " + (saldo + chequeEspecial));



    }

    
    

    
}
