import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Tabla de Multiplicar===");
        System.out.printf("Ingrese un numero (1 al 10): ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }else{
                System.out.println("El numero ingresado no esta en el rango (1 al 10).");
            }
        }
    }

