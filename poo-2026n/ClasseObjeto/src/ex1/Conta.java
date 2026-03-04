package ex1;
public class    Conta {
    public String nomeCliente;
    public int agencia, numeroConta;
    public float saldo;
    public boolean status; //true ativa | false desativa

    //método construtor
    public Conta (String nomeCliente, int agencia, int numeroConta){
    this.nomeCliente = nomeCliente;
    this.agencia = agencia;
    this.numeroConta = numeroConta;

    this.saldo= 0;
    this.status = true;
    }
    public void depositar(float valor){
        if (this.status){
            this.saldo +=valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Conta invalida.");
        }
    }
    public void sacar(float valor){
        if (!this.status){
            System.out.println("Conta invalida.");
        } else if (this.saldo >=valor) {
            this.saldo -=valor;
            System.out.println("Saque realizado com sucesso");
        } else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void  encerrarConta(){
        if (this.saldo == 0){
            this.status = false;
            System.out.println("Conta encerrada com sucesso.");
        }else {
            System.out.println("Saque o dinheiro antes de encerrar a conta.");
        }
    }
    public String toString(){
        return "Número: " + this.numeroConta+
                "\nAgência: " + this.agencia +
                "\nCliente: " + this.nomeCliente +
                "\nSaldo: " + this.saldo +
                "\nStatus: " + (this.status ? "Ativa" : "Encerrada");
    }
}
