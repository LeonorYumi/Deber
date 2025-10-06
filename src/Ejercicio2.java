import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("¿Cuantos numeros desea ingresar?: ");
        int num = scanner.nextInt();
        //Inicializador de numeros pares
        int contadorPar = 0;
        for  (int i = 1; i <= num; i++) {
            System.out.printf("Ingrese el numero: " + i + ": ");
            int numeros = scanner.nextInt();
            if (numeros % 2 == 0) {
                contadorPar++;
            }
        }
        System.out.printf("Se ingresaron " +contadorPar + " numeros pares");
    }
}
