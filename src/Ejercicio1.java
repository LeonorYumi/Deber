import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("===Notas del Estudiante===");
        System.out.printf("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        //Pide al usuario que ingrese sus notas
        System.out.printf("Ingrese la primera nota del estudiante: ");
        double nota1 = scanner.nextDouble();
        System.out.printf("Ingrese la segunda nota del estudiante: ");
        double nota2 = scanner.nextDouble();
        System.out.printf("Ingrese la tercera nota del estudiante: ");
        double nota3 = scanner.nextDouble();

        //Calcular promedio
        double promedio = (nota1 + nota2 + nota3)/3;
        System.out.printf("El promedio de: "+nombre+ " es: "+promedio);

        //Mostrar si aprueba >= 7
        if  (promedio >= 7) {
            System.out.println(" Usted aprueba");
        }else{
            System.out.println(" Usted reprueba");
        }
        //Limpiar el buffer
        scanner.nextLine();
    }
}
