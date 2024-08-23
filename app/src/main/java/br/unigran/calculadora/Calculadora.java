package br.unigran.calculadora;

public class Calculadora {

    public Double soma(Double n1, Double n2){
        return (double) (n1 + n2);
    }

    public Double subtrai(Double n1, Double n2){
        return (double) (n1 - n2);
    }

    public Double multiplica(Double n1, Double n2){
        return (double) (n1 * n2);
    }

    public Double divide(Double n1, Double n2){
        if (n2 == 0){
            return null;
        }
        return (double) (n1 / n2);
    }
}
