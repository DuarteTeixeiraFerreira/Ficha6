package org.example;

public class Ex3 {
    public int area(int base, int altura) {
        return base * altura;
    }


    public int perimetro(int base, int altura) {
        return 2 * (base + altura);
    }

    public boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
