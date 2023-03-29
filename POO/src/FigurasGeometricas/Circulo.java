package FigurasGeometricas;

import java.util.Scanner;

public class Circulo {
    float pi;
    float radio;
    // método constructor

    public Circulo(float pi, float radio) {
        this.pi = pi;
        this.radio = radio;
    }
    // métodos accesores

    public float getpi() {
        return pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setDiametro(float pi) {
        this.pi = pi;
    }

    public void setradio(float radio) {
        this.radio = radio;

    }

    // métodos propios

    // creamos el método para pedir datos
    public void pedirDatosCirculo() {

        Scanner juntar = new Scanner(System.in);

        System.out.println("Digite el valor de pi");
        pi = juntar.nextFloat();

        System.out.println("Digite el radio");
        radio = juntar.nextFloat();

        juntar.close();
    }

    public void calcularAreaCirculo() {
        float areaCirculo;
        areaCirculo = (pi * radio) * 2;
        System.out.println("El área del circulo es " + areaCirculo + "determinado por " + pi + " y " + radio);

    }

}
