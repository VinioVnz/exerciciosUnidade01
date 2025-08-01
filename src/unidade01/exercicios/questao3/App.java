package unidade01.exercicios.questao3;

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

        
        Pessoa p2 = new Pessoa();
        System.out.println("Qual sua altura? ");
        double p2Altura = input.nextDouble();
        
        System.out.println("Qual seu peso? ");
        double p2Peso = input.nextDouble();
        
        p2.peso = p2Peso;
        p2.altura = p2Altura;
        
        Pessoa p3 = new Pessoa();
        System.out.println("Qual sua altura? ");
        double p3Altura = input.nextDouble();
        
        System.out.println("Qual seu peso? ");
        double p3Peso = input.nextDouble();
        
        p3.peso = p3Peso;
        p3.altura = p3Altura;
        
        System.out.println("IMC: " + p1.calcularImc());
        System.out.println("IMC: " + p2.calcularImc());
        System.out.println("IMC: " + p3.calcularImc());

    }
}
