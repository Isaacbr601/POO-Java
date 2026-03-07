package ex2;
public class Basquete {
    private String nomeTimeCasa, nomeTimeVisitante;
    private int pontosCasa, pontosVisitante, periodoQuarto;

    //método construtor
    public Basquete(String nomeTimeCasa, String nomeTimeVisitante){
    this.nomeTimeCasa = nomeTimeCasa;
    this.nomeTimeVisitante = nomeTimeVisitante;

    this.pontosCasa = 0;
    this.pontosVisitante = 0;
    this.periodoQuarto = 1;
    }
    public void registrarPontos(String time, int tipo){
        if (tipo < 1 || tipo >3){
            System.out.println("Tipo de ponto invalido! Use 1, 2 ou 3.");
            return;
        }
        if (time.equalsIgnoreCase("casa")){
            this.pontosCasa +=tipo;
        } else if (time.equalsIgnoreCase("visitante")){
            this.pontosVisitante +=tipo;
        } else {
            System.out.println("Time invalido! USe 'casa' ou 'visitante'.");
        }
    }
    public void proximoQuarto(){
        if (this.periodoQuarto < 4){
            this.periodoQuarto++;
        }else {
            System.out.println("Jogo terminou");
        }
    }
    public String toString(){
        return nomeTimeCasa + "[" + pontosCasa + "] x [" + pontosVisitante + "]" +
                nomeTimeVisitante +"- Periodo " + periodoQuarto;
    }
}