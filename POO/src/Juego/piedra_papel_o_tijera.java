package Juego;

import java.util.Random;
import java.util.Scanner;

public class piedra_papel_o_tijera implements Juego { 
    //ATRIBUTOS
    private int opcion;
    private int opcionAleatoria;
    private String nombreJugador;

    //Instancia para capturar los datos
    Scanner captura = new Scanner(System.in);

    //Solicitar los datos
    public void iniciar(){
    System.out.println(" \nIngrese su nombre: ");
    nombreJugador=captura.next();
    }
    public void jugar(){
    System.out.println(nombreJugador + " Elija una opción: (piedra:1 papel:2 tijera:3)");
    opcion=captura.nextInt();
    Random aleatorio=new Random();
    opcionAleatoria=aleatorio.nextInt(3)+1;
    System.out.println("Su opción fue elegida, esta cargando...");
    System.out.println("██████████ 100%");
    }
    public void finalizar(){
        if(opcionAleatoria==1 && opcion==1){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que es empate y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==2 && opcion==2){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que es empate y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==3 && opcion==3){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que es empate y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==2 && opcion==1){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que perdio  y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==3 && opcion==2){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que perdio  y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==1 && opcion==3){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que perdio  y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==3 && opcion==1){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que gano  y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==1 && opcion==2){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que gano  y la opción de la maquina fue: " + opcionAleatoria);
        }else if(opcionAleatoria==2 && opcion==3){
            System.out.println(nombreJugador + " Su opción fue: " + opcion + " significa que gano  y la opción de la maquina fue: " + opcionAleatoria);
        }
}
}
