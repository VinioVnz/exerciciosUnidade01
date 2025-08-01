package unidade01.exercicios.questao2;
public class Pessoa {
    double altura;
    double peso;

    double calcularImc(){
        return peso/(altura*altura);
    }
}
