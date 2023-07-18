package Visao;

import Controle.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerTamagotchi tamagotchi = new ControllerTamagotchi();
        final String[] comidas = {"Ração", "Frutas", "Carne"};

        System.out.println("Bem-vindo(a) ao Tamagotchi!");
        System.out.println("Insira o nome do seu Tamagotchi:");
        tamagotchi.setNome(scanner.nextLine());

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alimentar o Tamagotchi");
            System.out.println("2 - Brincar com o Tamagotchi");
            System.out.println("3 - Ver informações do Tamagotchi");
            System.out.println("4 - Treinar o Tamagotchi");
            System.out.println("5 - Batalhar");
            System.out.println("6 - Verificar Saúde");
            System.out.println("7 - Ouvir o que o Tamagotchi tem a dizer");
            System.out.println("8 - Falar algo para o Tamagotchi");
            System.out.println("9 - Dormir");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Comidas disponíveis:");
                    for (int i = 0; i < comidas.length; i++) {
                        System.out.println(i + " - " + comidas[i]);
                    }
                    System.out.println("Escolha uma comida:");
                    int comidaEscolhida = scanner.nextInt();
                    if (comidaEscolhida >= 0 && comidaEscolhida < comidas.length) {
                        tamagotchi.alimentar(comidaEscolhida);
                        System.out.println("Você alimentou o " + tamagotchi.getNome() + " com " + comidas[comidaEscolhida]);
                    } else {
                        System.out.println("Comida inválida.");
                    }
                }
                case 2 -> tamagotchi.brincar();
                case 3 -> tamagotchi.verInformacoes();
                case 4 -> tamagotchi.treinar();
                case 5 -> {
                    ControllerInimigo inimigo = new ControllerInimigo();
                    inimigo.batalhar(tamagotchi);
                }
                case 6 -> tamagotchi.estaSaudavel();
                case 7 -> tamagotchi.conversar();
                case 8 -> {
                    scanner.nextLine();
                    tamagotchi.conversar(scanner.nextLine());
                }
                case 9 -> tamagotchi.dormir();
                case 0 -> {
                    System.out.println("Até a próxima!");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

            if (tamagotchi.getSaude() <= 0 || tamagotchi.getFadiga() >= 10 || tamagotchi.getPeso() <= 0) {
                System.out.println(tamagotchi.getNome() + " faleceu, você não cuidou bem do seu bichinho! Game over.");
                System.exit(0);
            } else if (tamagotchi.estaComFome()) {
                System.out.println(tamagotchi.getNome() + " está com fome! Alimente-o.");
            } else if (tamagotchi.estaCansado()) {
                System.out.println(tamagotchi.getNome() + " está cansado! Faça-o dormir.");
            } else if (tamagotchi.estaAbaixoDoPeso()) {
                System.out.println(tamagotchi.getNome() + " está abaixo do peso! Dê mais comida a ele.");
            } else {
                System.out.println(tamagotchi.getNome() + " está feliz e satisfeito!");
            }
        }
    }
}