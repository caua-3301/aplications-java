/*Problema "dados_pessoas"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/dados_pessoas.java
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
*/

public class PeopleData {
    private char genero;
    private double altura;

    //constructor
    public PeopleData(char genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setAltura(double aultura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }
}
