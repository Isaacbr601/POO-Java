package ex1;
public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("João Silva", 123, 1);
        c1.depositar(500);
        c1.sacar(200);

        System.out.println("\nEstado da conta c1:");
        System.out.println(c1);

        Conta c2 = new Conta("Maria Souza", 569, 2);
        c2.sacar(50);
        System.out.println("\nEstado da conta c2:");
        System.out.println(c2);

        c1.encerrarConta();
        c1.sacar(300);
        c1.encerrarConta();
        System.out.println("\n Estado final da conta c1:");
        System.out.println(c1);
    }
}
