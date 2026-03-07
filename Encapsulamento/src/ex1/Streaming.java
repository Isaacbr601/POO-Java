package ex1;
public class Streaming {
    private String usuario, plano, ultimoFilmeAssistido;
    private  float mensalidade;
    private boolean ativo;
    //método construtor
    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        this.setPlano(plano);
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }
    //Definir plano e mensalidade
    private void setPlano(String plano){
        if (plano.equals("Básico")){
            this.mensalidade = 25.90f;
        }
        else if (plano.equals("Premium")) {
            this.mensalidade = 45.90f;
        }
        else if (plano.equals("Família")) {
            this.mensalidade = 60.90f;
        }
        else {
            System.out.println("Opção inválida");
            this.mensalidade = 0f;
        }
    }
    //Assitir filme
    public void assistirFilme(String nomeFilme){
        if (this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        }
        else {
            System.out.println("Conta inativa. Por favor, pague a fatura.");
        }
    }
    //Cancelas a assinatura
    public void cancelarAssinatura(){
        this.ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    public String toString(){
        String status = ativo ? "Ativo" : "Suspenso";
        return "Usuário: " + usuario + "\n" +
                "Plano: " + plano + "\n" +
                "Mensalidade: $" + mensalidade + "\n" +
                "Status: " + status + "\n" +
                "Último Filme Assistido: " + (ultimoFilmeAssistido.isEmpty() ? "Nenhum": ultimoFilmeAssistido);
    }
}
