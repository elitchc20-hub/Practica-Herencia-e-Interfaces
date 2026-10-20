
package com.mycompany.figuras;

public class Figuras {
    
    public static void main(String[] args){
        
        Fig2D f = new TrianRecto(3, 4);
        System.out.println(f.imprimeFigura());
    
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }   
}
