package unidade01.exercicios.questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Qual sua altura? ");
        double altura = input.nextDouble();
        
        System.out.println("Qual seu peso? ");
        double peso = input.nextDouble();

        p1.peso = peso;
        p1.altura = altura;

        System.out.println("IMC: "+p1.calcularImc());

    }
}
