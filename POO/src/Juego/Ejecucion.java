package Juego;

public class Ejecucion {
    public static void main(String[] args) {
        piedra_papel_o_tijera juego1= new piedra_papel_o_tijera();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
    }
}
