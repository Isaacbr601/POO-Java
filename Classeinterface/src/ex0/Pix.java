package ex0;

public class Pix implements Pagamento{
    private String chavePix;

    public Pix(String chavePix) {
    this.chavePix = chavePix;
    }

    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando QR Code para a chave " + chavePix);
        System.out.println("Pagamento de R$ " + valor + " recebido instantaneamente");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponivél no App do banco");
    }

    @Override
    public String toString() {
        return "Pix{" +
                "chavePix='" + chavePix + '\'' +
                '}';
    }
}
