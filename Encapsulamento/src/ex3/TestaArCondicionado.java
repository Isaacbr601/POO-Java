package ex3;
public class TestaArCondicionado {
    static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("LG", "Dual Inverter", 22);

        ar.ajustarTemperatura(10);
        ar.ajustarTemperatura(25);

        System.out.println(ar);

        ar.ligar();
        ar.modoTurbo();
        System.out.println(ar);
    }
}
