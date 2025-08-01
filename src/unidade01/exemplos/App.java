package unidade01.exemplos;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Manske";
        cachorro.raca = "Vira lata";
        cachorro.cor = "Preto";
        cachorro.peso = 9999.9;
        cachorro.latir();
        System.out.println("Informações cachorro: "+cachorro.nome);
        System.out.println("Cor: "+cachorro.cor);
        cachorro.pegarCoisa("Stephanie");


        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Toilet";
        cachorro2.raca = "skibidi";
        cachorro2.cor = "preto";
        cachorro2.peso = 12.2;

        cachorro2.pegarCoisa("Controle");
    }
}
