 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfigurasgeometricas;

/**
 *
 * @author ALUMNO-
 */
public class Cuadrado implements Figuras2{
    private int base, altura;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro(int base, int altura, int hi) {
        return 4*base;
    }

    @Override
    public double area(int b, int h) {
        return b*h;
    }
}
