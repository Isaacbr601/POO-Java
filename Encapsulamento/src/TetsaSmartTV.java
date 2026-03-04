public class TetsaSmartTV {
   public static void main(String[] args) {

        SmartTv obj1 = new SmartTv("Samsung", "32 polegadas", 0);
        System.out.println(obj1.toString());
        //altera o volume
        obj1.setVolume(30);
        System.out.println("Valor do volume" + obj1.getVolume());
        System.out.println("A marca da Tv é: " + obj1.getMarca());
        System.out.println("O modelo da Tv é: "+ obj1.getModelo());
        SmartTv obj3 = new SmartTv("LG", "32 polegadas", -120);
        obj3.setVolume(30);
        obj3.entrarYouTube();

    }
}
