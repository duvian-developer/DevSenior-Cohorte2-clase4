import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número real");
        var numero = scanner.nextInt();
        if(numero<0){
            System.out.println("El número " + numero + " es negativo");
        } else if(numero>0){
            System.out.println("El número " + numero + " es positivo");
        }
    }
}