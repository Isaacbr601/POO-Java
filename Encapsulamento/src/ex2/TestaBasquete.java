package ex2;
public class TestaBasquete {
     public static void main(String[] args) {
         Basquete jogo = new  Basquete("Time A", "Time B");
        jogo.registrarPontos("casa", 3);
        jogo.registrarPontos("visitante", 2);
         System.out.println(jogo);

         jogo.proximoQuarto();
         System.out.println(jogo);
    }
}
