package ex2;

public class Email extends CanalNotificacao {

    private String assunto;

    public Email(){
        super();
    }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar(){
        System.out.println("Enviando E-mail para: " + getDestinatario() +
                " com o assunto " + assunto + ": " + getMensagem());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", assunto: " + assunto;
    }
}
