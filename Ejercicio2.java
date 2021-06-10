import java.util.Scanner;

    public class Ejercicio2{
        public static void main(String[] args){
            int numero;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese un número: ");
            numero = entrada.nextInt();
            for(int i = numero; i >= 1; i--){
                System.out.println( i + " ");
            }
        }
    }