package Enum;
public enum FalasTamagotchi {
    JAMES("Liga pro James! Quero uma salada de frutas!"),
    EU("Quem sou eu?"),
    VIDA("Qual o propósito da minha vida?"),
    REALIDADE("O que é a realidade? Eu sou real?"),
    EXISTENCIA("Existe um significado maior para a minha existência?"),
    AQUI("Por que estamos aqui?"),
    MORTE("O que acontece após a morte?"),
    LIVRE("Somos livres para fazer nossas próprias escolhas?"),
    DESTINO("Existe um destino pré-determinado para cada um de nós?"),
    TEMPO("Meu tempo com você parece ser curto e precioso, irei aproveita-lo!");

    private final String fala;

    FalasTamagotchi(String fala) {
        this.fala = fala;
    }

    public String getFala() {
        return fala;
    }
}
