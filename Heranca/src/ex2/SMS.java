package ex2;

public class SMS extends CanalNotificacao{
    private int numeroTelefone;

    public SMS(){
        super();
    }

    public SMS(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número: " + numeroTelefone +
                ": " + getMensagem());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", número: " + numeroTelefone;
    }
}
