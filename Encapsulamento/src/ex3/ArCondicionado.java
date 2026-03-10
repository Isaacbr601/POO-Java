package ex3;
public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){
        marca = "Genérico";
        modelo = "Padrão";
        temperatura = 24;
        ligado = false;
    }
    public ArCondicionado(String marca, String modelo, int temperatura){
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    private int getTemperatura(){
        return temperatura;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTemperatura(int temperatura){

        if (temperatura >= 16 && temperatura <= 30){
            this.temperatura = temperatura;
        } else {
            System.out.println("Erro: Temperatura deve estar entre 16ºC e 30ºC");
        }
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void ligar(){
        this.ligado = true;
        System.out.println("Ar-condicionado ligado.");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Ar-condicionado desligado.");
    }
    public void ajustarTemperatura(int novaTemp){
        if (ligado){
            setTemperatura(novaTemp);
        } else {
            System.out.println("Não é possivel ajustar a temperatura. O aparelho está desligado.");
        }
    }
    public void modoTurbo(){
        if (ligado){
            processarResfriamentoRapido();
        }
        else {
            System.out.println("Não foi possível ativar o modo turbo. O aparelho está desligado.");
        }
    }
    private void processarResfriamentoRapido(){
        System.out.println("Aumentando rotação do compressor...");
        System.out.println("Ligando ventilação máxima...");
        setTemperatura(16);
        System.out.println("Modo Turbo ativado, Temperatura ajustada para 16°C.");
    }
    public String toString(){
        String status = ligado ? "ligado" : "Desligado";
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temperatura + "°C" +
                "\nStatus: " + status;

    }
}
