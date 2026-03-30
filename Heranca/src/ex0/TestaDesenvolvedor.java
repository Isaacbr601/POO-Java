package ex0;

import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void mostra(Desenvolvedor camaleao){
        camaleao.codar();// executa o codar () de qm o cameao representa na chamada do método
        // executa o toString() e calcularBonus() de quem o camelao representa na chamada do método
        System.out.println(camaleao.toString() + " Bônus" + camaleao.calcularBonus());
    }

    public static void main(String[] args){

        //cria um objeto da class Desenvolvedor (classe pai)
        Desenvolvedor camaleao;

        ex0.Junior jr1 = new Junior("Fulano", "Java", 5000, "Beltrano");
        mostra(jr1);

        ex0.Pleno pl1 = new Pleno("Beltrano", "Java", 8000, 7);
        mostra(pl1);

        ex0.Senior se1 = new Senior("Ciclano", "Java", 12000, 3000);
        mostra(se1);

        // cria um vetor de Desenvolvedor
        ArrayList<Desenvolvedor> desenvolvedors = new ArrayList<Desenvolvedor>();
        // adicionar os desenvolvedores no array
        desenvolvedors.add(jr1);
        desenvolvedors.add(pl1);
        desenvolvedors.add(se1);
        // exibe codar, calcularBonus e toString de cada desenvolvedor
        for (Desenvolvedor dev : desenvolvedors){
            mostra(dev); //polimorfismo
        }
    }
}
