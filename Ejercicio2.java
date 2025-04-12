import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // se piden los datos y tambien se asignan valores a las variables
    System.out.print("¿Cual es tu nombre? ");
    String nombre = sc.nextLine();
    System.out.print("¿Cual es tu correo electronico? ");
    String correo = sc.nextLine();
    System.out.print("¿Cual es tu edad? ");
    int edad =  sc.nextInt();
    // se muestran los datos ordenados al usuario 
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Nombre: "+ nombre);
    System.out.println("Edad: "+ edad);
    System.out.println("Correo: "+correo);

    
    }
}
