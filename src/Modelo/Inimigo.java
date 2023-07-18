package Modelo;

public abstract class Inimigo extends Tamagotchi {
    public Inimigo() {
        super();
        this.nome = "Inimigo";
        this.peso = 1.5;
        this.fadiga = 0;
    }
    public abstract void batalhar(Tamagotchi tamagotchi);
}
