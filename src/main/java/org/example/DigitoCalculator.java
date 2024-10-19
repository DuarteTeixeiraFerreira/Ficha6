package org.example;

public class DigitoCalculator {
    public double mediaDigitos(int numero) {
        int soma = 0;
        int quantidadeDigitos = 0;
        int n = Math.abs(numero);
        while (n > 0) {
            soma += n % 10;
            n /= 10;
            quantidadeDigitos++;
        }
        if (quantidadeDigitos == 0) {
            quantidadeDigitos = 1;
        }
        return (double) soma / quantidadeDigitos;
    }
}
