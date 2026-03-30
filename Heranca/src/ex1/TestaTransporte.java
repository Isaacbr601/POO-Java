package ex1;

public class TestaTransporte {
    public static void exibe(Veiculo referencia){
    referencia.mover(); //Polimorfismo
    referencia.abastecer(); //Polimorfismo
    }

    public static void main(String[] args){
        System.out.println("---Testando Avião---");
        Aviao av1 = new Aviao("Boeing", "747", 900.0f, 110);
        exibe(av1);

        System.out.println("\n ---Testando Carro Elétrico---");

        CarroEletrico ce1 = new CarroEletrico("Tesla", "Model S", 120.0f, 500);
        exibe(ce1);

        Veiculo ve1 = new CarroEletrico("Fiat", "Uno", 80.0f, 300);
        exibe(ve1);
    }
}
