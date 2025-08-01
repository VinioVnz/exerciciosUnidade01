package unidade01.exercicios.questao1;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc(){
        return peso/(altura*altura);
    }
}
