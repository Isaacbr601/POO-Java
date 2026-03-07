package ex0;
public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadoInternet;

    //construtor sem parâmetros
    public SmartTv(){
        this.volume = 0;
        this.marca = "indefinido";
        this.modelo = "indefinido";
        this.conectadoInternet = false;
    }
    //construtor com parâmetros
    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca; this.modelo = modelo;
        this.setVolume(volume);

    }

    //altera o valor de volume
    public void setVolume(int volume){
        if (volume >=0 && volume <=100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }

    //obter o valor do volume
    public int getVolume(){
        return this.volume;
    }
    public void aumentarVolume(int x ){
        this.setVolume(this.volume + x);
    }
    public  void diminuirvolume(int x){
        this.setVolume(this.volume - x);
    }

    //obter o modelo da tv
    public String getModelo(){
        return this.modelo;
    }

    //obter a marca da tv
    public String getMarca(){
    return  this.marca;
    }

    //método publico para entrar no YouTube
    public void entrarYouTube(){
    if (!this.conectadoInternet){
        this.conectarInternet();
        System.out.println("Abrindo o Youtube");
        }
    else {
        System.out.println("Internet não encontrada");
        }
    }
    //método privado que liga a internet
    private boolean conectarInternet(){
        System.out.println("Buscando sinal de wi-fi");
        System.out.println("Verificando as credenciais");
        System.out.println("Autenticando IP no roteador");

        //liga a SmartTv na internet
        int randomico = (int) (Math.random() * 10); // gera numeros entre 0 e 9
        if (randomico < 5){
            this.conectadoInternet = true;
            return true;
        }
        else {
            this.conectadoInternet = false;
            return false;
        }

    }

    public String toString(){
         return "Marca: " + this.marca +
         "Modelo: " + this.modelo +
         "Volume: " + this.volume;
    }
}