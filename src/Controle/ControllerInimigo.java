package Controle;

import Modelo.*;
import java.util.Random;
public class ControllerInimigo extends Inimigo implements Descricao {
    public ControllerInimigo() {
        super();
    }

    @Override
    public void batalhar(Tamagotchi tamagotchi) {
        if (tamagotchi.estaCansado()) {
            System.out.println(tamagotchi.getNome() + " está cansado e não pode lutar!");
            return;
        }
        int tamagotchiForca = tamagotchi.getForca();
        this.forca = tamagotchiForca - 1 + new Random().nextInt(3);
        verInformacoes();
        System.out.println("O Inimigo atacou seu Tamagotchi!");

        switch (Integer.compare(this.forca, tamagotchi.getForca())) {
            case 1 -> {
                System.out.println("O Inimigo venceu!");
                tamagotchi.setFadiga(getFadiga() + 1);
                tamagotchi.setSaude(getSaude() - 1);
            }
            case 0 -> {
                System.out.println("Empate!");
                tamagotchi.setFadiga(tamagotchi.getFadiga() - 1);
            }
            case -1 -> {
                System.out.println(tamagotchi.getNome() + " venceu!");
                tamagotchi.setFadiga(getFadiga() + 1);
            }
        }
        tamagotchi.setEstaComFome(true);
    }
    @Override
    public void verInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Força: " + this.forca);
        System.out.println("Saúde:" + this.saude);
    }
}
