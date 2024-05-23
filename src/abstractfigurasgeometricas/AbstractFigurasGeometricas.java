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
public class AbstractFigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuadrado c=new Cuadrado();
        Rectangulo r=new Rectangulo();
        Triangulo t=new Triangulo();
        System.out.println("El area del cuadrado es: "+c.area(5, 5));
        System.out.println("El area del rectangulo es: "+r.area(8, 4));
        System.out.println("El area del Triangulo es: "+t.area(8, 4));
        System.out.println("El perimetro del cuadrado es: "+c.perimetro(5, 0,0));
        System.out.println("El perimetro del rectangulo es: "+r.perimetro(8, 4,0));
        System.out.print("El perimetro del Triangulo es: "+t.perimetro(8, 4,9));
    }
    
}
