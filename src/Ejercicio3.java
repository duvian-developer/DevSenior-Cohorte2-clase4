import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        var numero = scanner.nextInt();
        if(numero%2==0){
            System.out.println("El número " + numero + " es par");
        }else {
            System.out.println("El número " + numero + " es impar");
        }
    }
}
