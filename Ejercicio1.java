import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
     double numeros[] = new double [2]; 
     //se crea un arrreglo para recibir los dos numeros que necesitamos. 
     //se definen las varaibles de las operaciones 
     double suma = 0;
     double resta = 0;
     double multiplicacion = 0;
     double division = 0;
     double modulo =0;
     // se declara la variable para leer
      Scanner sc = new Scanner(System.in);
     
     
     for (int i = 0; i< numeros.length;i++){
         System.out.print("Escribe un numero: ");
         // se leen los dos numeros que necesitamos
        numeros[i]= sc.nextDouble();
         
     }
     // se realizan las operaciones con los numeros que recolectamos anteriormente 
         suma = numeros[0]+numeros[1];
         resta =  numeros[0]-numeros[1];
         multiplicacion =  numeros[0]*numeros[1];
         division =  numeros[0]/numeros[1];
         modulo =  numeros[0]%numeros[1];
     
     // se muestran los resutados de las operaciones resueltas anteriormente.
      System.out.println("La suma de los dos numeros es "+suma);
      System.out.println("La resta de los 2 numeros es " + resta);
      System.out.println("El producto de multiplicar los numeros es " + multiplicacion);
      System.out.println("La division de los numeros es " + division);
      System.out.println("El residuo de dividir los numeros es " + modulo);


    }
}
