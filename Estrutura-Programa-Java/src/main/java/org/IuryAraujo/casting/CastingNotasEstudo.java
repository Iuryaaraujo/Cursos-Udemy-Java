package org.IuryAraujo.casting;

/*
Casting: Operação de transformar um tipo de dados em outro.

Widening Casting vc Narrowing Casting
 */
public class CastingNotasEstudo {
    public static void main(String[] args) {
        // Widening Casting (Implícito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variavelGrande);
        System.out.println(variavelInt);

        // Narrowing Casting (Explícito)
        long variavelLong = 344514861644415L;
        int variavelInt2 = (int) variavelLong;
        System.out.println(variavelInt2);

        // Operações de dicisão entre números inteiros
        int numero1 = 8;
        int numero2 = 2;
        float resultadooDivisao = (float) numero1 / numero2;
        System.out.println(resultadooDivisao);
    }
}
