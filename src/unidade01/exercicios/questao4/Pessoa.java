package unidade01.exercicios.questao4;

public class Pessoa {
    double altura;
    double peso;
    String nome;

    double calcularImc(){
        System.out.println("Pessoa: "+nome);
        return peso/(altura*altura);
    }
}
