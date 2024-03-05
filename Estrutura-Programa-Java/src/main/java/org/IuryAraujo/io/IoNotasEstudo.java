package org.IuryAraujo.io;

import java.util.Scanner;

/*
Entrada e Saída (I/O) de daos no Java.

Entrada de dados: Ler dados digitados pelo usuário.
Saída de dado: Escrever dados para o usuário.
 */
public class IoNotasEstudo {
    public static void main(String[] args) {
        // Leitura de dados de entrada
        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        int valorDigitado = sc.nextInt();
        System.out.println(valorDigitado);
        sc.close();

        // Saída de dados
        System.out.printf("O número digitado foi %d", valorDigitado);
    }
}
