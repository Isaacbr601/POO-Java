package ex0;

public class Pleno extends Desenvolvedor {
    private int projetosEntregues;

    public Pleno(){
        super();
    }
    public Pleno(String nome, String linguagem, float salario, int projetosEntregues){
        super(nome, linguagem, salario);
        this.projetosEntregues = projetosEntregues;
    }
    public void setProjetosEntregues(int projetosEntregues){
        this.projetosEntregues = projetosEntregues;
    }
    public int getProjetosEntregues(){
        return this.projetosEntregues;
    }
    @Override
    public void codar(){
        System.out.println("Pleno codando e realizando Code Review");
    }
    @Override
    public double calcularBonus(){
        return super.calcularBonus() + 500;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                ", salario=" + salario +
                ", Quantidade de projetos entregues" + projetosEntregues +
                '}';
    }
}
