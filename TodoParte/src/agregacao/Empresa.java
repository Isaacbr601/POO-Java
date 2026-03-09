package agregacao;

import java.util.ArrayList;

public class Empresa {
    private int id;
    private String nome, cnpj;
    private ArrayList freeLancers;

    public Empresa() {
        this.freeLancers = new ArrayList();//cria espaço na memória
    }

    public Empresa(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.freeLancers = new ArrayList();
    }

    //adiciona um freeLancer na empresa
    public void adicionarFreelancer(FreeLancer freelancer){
        this.freeLancers.add(freelancer);
    }
    //remove um freelancer na empresa
    public void removerFreeLancer(FreeLancer freeLancer){
        this.freeLancers.remove(freeLancer);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList getFreeLancer() {
        return freeLancers;
    }

    public void setFreeLancer(ArrayList freeLancer) {
        this.freeLancers = freeLancer;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", freeLancer=" + freeLancers +
                '}';
    }
}
