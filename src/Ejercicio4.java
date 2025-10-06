import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();

        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Solicitar altura
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Verificar si cumple los requisitos
        if (edad > 18 && altura > 1.60) {
            System.out.println("Aceptado para el equipo. ");
            } else {
                System.out.println("No cumple los requisitos. ");
            }
        }

    }