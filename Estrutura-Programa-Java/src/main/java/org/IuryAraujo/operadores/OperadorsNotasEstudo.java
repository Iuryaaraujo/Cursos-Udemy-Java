package org.IuryAraujo.operadores;

public class OperadorsNotasEstudo {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;

        System.out.println(soma);
        // System.out.println(numero1 + numero2);
        System.out.println("A soma é: " + soma);

        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
        System.out.println(subtracao);

        double numero5 = 2.5;
        double numero6 = 6;
        double multiplicacao = numero5 * numero6;
        System.out.println(multiplicacao);

        int numero7 = 7;
        int numero70 = 70;
        int divisao = numero70 / numero7;
        System.out.println(divisao);

        int numero71 = 71;
        int modulo = numero71 % numero7;
        System.out.println("O Resto é: " + modulo);

        int contador = 0;
//        contador = contador + 1;
//        contador = contador + 1;
        contador++;
        contador++;
        System.out.println("Incremento: " + contador);

        contador--;
        contador--;
        System.out.println("Decremento: " + contador);


        double decimal1 = 1.0;
        double decimal2 = 2.0;
        boolean ehMaior = decimal2 > decimal1;
        System.out.println(ehMaior);

        boolean ehMenor = decimal2 < decimal1;
        System.out.println(ehMenor);

        System.out.println(decimal1 >= decimal1);
        System.out.println(decimal1 <= decimal1);

        System.out.println(decimal1 == decimal1);
        System.out.println(decimal1 != decimal1);

        int variavel = 1;
        variavel += 4;
        variavel = variavel + 4;
        variavel -= 4;
        variavel *= 4;
        variavel /= -4;
        variavel %= 1;
        System.out.println(variavel);

        int valo1 = 4;
        int valor2 = 2;
        boolean expressaoand = valo1 < 10 && valor2 < 10;
        System.out.println(expressaoand);

        boolean expressaOr = valo1 < 10 || valor2 < 2;
        System.out.println(expressaOr);

        boolean expressaoNegada = (2 < 1);
        System.out.println(!expressaoNegada);
    }
}
