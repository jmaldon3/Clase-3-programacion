import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // se inicializan las variables por fuera del bucle 
        int opc;
        double pi = 3.141592;
        double alturat;
        double baset;
        double areat;
        double alturar;
        double baser;
        double arear;
        double radio;
        double areac;

        // se inicia un Do while para que se repita 
        do{
            // se muestra el primer menu para saber que es lo que desea hacer el usuario 
            System.out.println("Elige la figura de la cual deseas calcular el area");
            System.out.println("");
            System.out.println("(1). Triangulo");
            System.out.println("(2). Rectangulo");
            System.out.println("(3). Circulo");
            System.out.println("");
            // se lee la opcion que desea realizar el usuario 
            
            opc = sc.nextInt();
             
            switch (opc) { 
               case 1: 
                   // en el caso uno se solicitan las medidas del triangulo para realizar la operacion 
                    System.out.println("Vamos a calcular el area de un Triangulo");
                    System.out.println("¿Cual es la altura del triangulo?");
                    alturat = sc.nextDouble(); // se lee el dato
                    System.out.println("¿Cual es la base del triangulo?");
                    baset = sc.nextDouble(); // se lee el dato 
                    areat = ( (alturat * baset) / 2 );
                    System.out.println("El area del triangulo es: "+ areat);
                    // sele muestra el resultado al usuario 
                    break;
                case 2:
                    System.out.println("Vamos a calcular el area de un Triangulo");
                    System.out.println("¿Cual es la altura del rectangulo?");
                    alturar =  sc.nextDouble(); // se lee el dato
                    System.out.println("¿Cual es la base del rectangulo?");
                    baser = sc.nextDouble(); // se lee el dato
                    arear = (alturar * baser); // se realiza la operacion
                    System.out.println("El area del rectangulo es: "+ arear);// se muestra el resultado
                    break;
                case 3:
                    System.out.println("Vamos a calcular el area de un circulo");
                    System.out.println("¿Cual es la altura del circulo?");
                    radio = sc.nextDouble();// se lee el dato 
                    areac = pi*radio*radio; // se realiza la operacion 
                    System.out.println("El area del circulo es: "+ areac);// se muestra el resultado
                    break; 
            }
            
       
        } while (opc > 0); // se pone esa condicion para que se repita 
    }  
}
