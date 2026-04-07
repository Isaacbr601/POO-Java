package ex0;

public class Checkout {
    public static void main(String[] args) {
        //Variável do tipo interface
        Pagamento selector;
        //cliente escolheu PIX
        selector = new Pix("idsdjis@gmail.com");
        selector.autorizar(150.0); //polimorfismo
        selector.exibirComprovante();

        //Cliente mudou de ideia e escolheu cartão
        selector = new CartaoCredito("13325486584");
        selector.autorizar(300.0);
        selector.exibirComprovante(); //polimorfismo
    }
}
