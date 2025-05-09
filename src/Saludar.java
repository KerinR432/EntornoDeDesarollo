package src;

import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) {
        String nombre = "";
        String apellidos = "";
        Scanner scanner = new Scanner(System.in);

        // Encabezado
        System.out.println("*****************************");
        System.out.println("*        Hola a todos!      *");
        System.out.println("*****************************");
        System.out.println();

        // Solicitar nombre y apellidos
        System.out.print("Introduce tu nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Introduce tu apellido: ");
        apellidos = scanner.nextLine();

        System.out.println();
        System.out.println("*****************************");
        System.out.println("*  Hola " + nombre + "!       *");
        System.out.println("*  Gracias por usar nuestro   *");
        System.out.println("*  programa.                  *");
        System.out.println("*  Esperamos que lo disfrutes! *");
        System.out.println("*  Guardaremos tus datos:     *");
        System.out.println("*  " + nombre + " " + apellidos + "  *");
        System.out.println("*****************************");
        System.out.println("Saludos,");
        System.out.println("rt: Gladus");
    }
}
