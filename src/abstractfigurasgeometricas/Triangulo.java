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
public class Triangulo implements Figuras2{

    @Override
    public double area(int b, int h) {
        return b*h/2;
    }

    @Override
    public double perimetro(int base, int altura, int hi) {
       return base+altura+hi;
    }
    
}
