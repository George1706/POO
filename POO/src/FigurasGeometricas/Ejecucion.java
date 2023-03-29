package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {

    private static final float Radio = 0;
    private static final float pi = 0;

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Circulo circulo = new Circulo(pi, Radio);
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();

        int intentos;
        int figura;

        System.out.println(
                "Hola como estás esperamos que estes bien, este es un programa para hallar el área de una figura geometrica");
        System.out.println("Por favor ingresa el número de intentos que vas a realizar");
        intentos = lectura.nextInt();

        for (int i = 1; i < intentos; i++) {

            System.out.println("Por favor ingrese la figura a la que le quiere descubrir el área ");
            System.out.println("1.Circulo   2.Cuadrado   3.Rectangulo   4.Triangulo");
            figura = lectura.nextInt();

            if (figura == 1) {

                circulo.pedirDatosCirculo();
                circulo.calcularAreaCirculo();

            } else if (figura == 2) {

                cuadrado.pedirDatosCuadrado();
                cuadrado.calcularAreaCuadrado();

            } else if (figura == 3) {

                rectangulo.pedirDatosRectangulo();
                rectangulo.calcularAreaRectangulo();

            } else if (figura == 4) {

                triangulo.pedirDatosTriangulo();
                triangulo.calcularAreaTriangulo();

            }
        }
        lectura.close();
    }
}
