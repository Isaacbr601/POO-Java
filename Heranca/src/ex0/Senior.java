package ex0;

public class Senior extends Desenvolvedor{
    private double verbaLideranca;

    public Senior() {
        super();
    }
    public Senior(String nome, String linguagem, float salario, double verbaLideranca) {
        super(nome, linguagem, salario);
        this.verbaLideranca = verbaLideranca;
    }

    public double getVerbaLideranca() {
        return verbaLideranca;
    }

    public void setVerbaLideranca(double verbaLideranca) {
        this.verbaLideranca = verbaLideranca;
    }
    @Override
    public double calcularBonus(){
        return super.calcularBonus() + this.salario * 0.15 + this.verbaLideranca;
    }
    @Override
    public void codar(){
        System.out.println("Sẽnior desenhando a  arquiterura e orientnado a equipe");
    }
    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLideranca=" + verbaLideranca +
                '}';
    }
}
