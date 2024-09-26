package com.mycompany.quizmario;

import java.util.Scanner;

public class QuizMario {

    public static void main(String[] args) {
        Mario mario = new Mario("Mario", 3, "salto", "caminar");

        Scanner scanner = new Scanner(System.in);
        String input;
        while (mario.getVidas() > 0) {
            System.out.println("Escribe 'd' para moverse a la derecha, 'a' para moverse a la izquierda, 'w' para saltar o 'p' para perder una vida:");
            input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "d":
                    mario.moverse("d");
                    break;
                case "a":
                    mario.moverse("a");
                    break;
                case "w":
                    mario.saltar("w");
                    break;
                case "p":
                    mario.perderVida();
                    break;
                default:
                    System.out.println("Tecla Invalida");
                    break;
            }
        }

        System.out.println("Juego terminado");
    }
}
