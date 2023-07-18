package Modelo;

public abstract class Tamagotchi {
    protected String nome;
    protected int idade;
    protected double peso;
    protected int fadiga;
    protected int forca;
    protected boolean estaComFome;
    protected int saude;
    protected static final int SAUDE = 5;

    public Tamagotchi() {
        this.nome = "Tamagotchi";
        this.idade = 0;
        this.peso = 1.0;
        this.fadiga = 0;
        this.estaComFome = true;
        this.forca = 0;
        this.saude = SAUDE;
    }

    public boolean estaComFome() {
        return this.estaComFome;
    }
    public boolean estaCansado() { return this.fadiga > 5; }
    public boolean estaAbaixoDoPeso() { return this.peso < 1.5; }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getSAUDE() {
        return SAUDE;
    }
    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getFadiga() {
        return fadiga;
    }

    public void setFadiga(int fadiga) {
        this.fadiga = fadiga;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public boolean isEstaComFome() {
        return estaComFome;
    }

    public void setEstaComFome(boolean estaComFome) {
        this.estaComFome = estaComFome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }
}
