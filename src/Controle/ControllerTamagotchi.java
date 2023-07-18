package Controle;
import Enum.FalasTamagotchi;
import java.util.Random;
import Modelo.Descricao;
public class ControllerTamagotchi extends Modelo.Tamagotchi implements Descricao {

    public ControllerTamagotchi() { super(); }

    public void alimentar(int tipoComida) {
        switch (tipoComida) {
            case 0 -> {
                peso += 0.1;
                estaComFome = false;
            }
            case 1 -> {
                peso += 0.3;
                estaComFome = false;
            }
            case 2 -> {
                peso += 0.5;
                estaComFome = false;
            }
            default -> System.out.println("Tipo de comida inválido.");
        }
    }

    public void treinar() {
        System.out.println("Você treinou o " + this.nome + " Ele está mais forte");
        this.forca++;
        this.fadiga++;
        this.estaComFome = true;
    }

    public void brincar() {
        System.out.println("Você brincou com o " + this.nome);
        this.peso = ((int) (this.peso * 10) - 1) / 10.0;
        this.fadiga++;
        this.estaComFome = true;
    }

    public void dormir() {
        this.saude = SAUDE;
        this.fadiga = 0;
        System.out.println(this.nome + " está bem descansado, sua fadiga diminuiu e ele está melhor de saúde!");
        this.idade++;
    }

    public void conversar() {
        FalasTamagotchi[] falas = FalasTamagotchi.values();
        int index = new Random().nextInt(falas.length);
        FalasTamagotchi fala = falas[index];
        System.out.println(nome + ": " + fala.getFala());
    }

    public void conversar(String mensagem) {
        System.out.println("Você: " + mensagem);
        System.out.println(nome + ": " + "Obrigado por compartilhar isso comigo, suas palavras me confortam!");
    }

    @Override
    public void verInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Está com fome? " + this.estaComFome);
        System.out.println("Força: " + this.forca);
        System.out.println("Saúde:" + this.saude);
    }

    public void estaSaudavel() {
        if (saude >= 5) {
            System.out.println("Seu Tamagotchi está saudável!");
        } else {
            System.out.println("Seu tamagotchi está machucado, melhor deixá-lo descansar");
        }
    }


}
