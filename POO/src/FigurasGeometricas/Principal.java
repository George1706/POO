package FigurasGeometricas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float lado,base,altura;
        double reto=0.9;
        Scanner captura=new Scanner(System.in);
        //Se imprime un mensaje pidiendo los datos
        System.out.println("Por favor digite el lado del cuadrado");
        lado=captura.nextFloat();
        System.out.println("Por favor digite la base del rectángulo");
        base=captura.nextFloat();
        System.out.println("Por favor digite la altura del rectángulo");
        altura=captura.nextFloat();
        //Creamos métodos constructores
        Cuadrado c1=new Cuadrado(lado);
        Rectangulo r1=new Rectangulo(base, altura);
        //Se invocan los métodos
        c1.calcularArea();
        r1.calcularArea();
        captura.close();
    }
}
 