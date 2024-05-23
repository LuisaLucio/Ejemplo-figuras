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
public class Rectangulo implements Figuras2{
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
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
    
    public double perimetro(int base, int altura, int hi){
        return 2*base+2*altura;
    }

    @Override
    public double area(int b, int h) {
        return b*h;
    }
}
