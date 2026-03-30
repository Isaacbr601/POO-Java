package ex1;

public class Aviao extends Veiculo{
    private float altitudeMax;

    @Override
    public void mover(){
        System.out.println("Avião voando a" + getVelocidade() + "km/h" + altitudeMax );
    }
    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
    }

    public Aviao() {
        super();
    }

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }
    @Override
    public String toString(){
        return super.toString() + ", Altitude Máxima: " + altitudeMax;
    }
}
