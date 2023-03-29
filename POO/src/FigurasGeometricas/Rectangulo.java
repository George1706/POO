package FigurasGeometricas;

import java.util.Scanner;

public class Rectangulo extends Figura {
    // atributos
    float base, altura;
    // constructor

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    // métodos accesores
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    // métodos propios

    public void pedirDatosRectangulo() {

        Scanner juntar = new Scanner(System.in);

        System.out.println("Digite el valor de la base");
        base = juntar.nextFloat();
        System.out.println("Digite la altura del rectangulo");
        altura = juntar.nextFloat();
        juntar.close();
    }

    public void calcularAreaRectangulo() {
        float area;
        area = base * altura;
        System.out
                .println("la altura del rectangulo es: " + altura + " su base es: " + base + " y su área es: " + area);
    }

    @Override
    public void calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ERROR'");
    }

}
