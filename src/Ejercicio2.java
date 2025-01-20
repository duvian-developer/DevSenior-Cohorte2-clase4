import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        var num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        var num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número");
        var num3 = scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("el número " + num1 + " es el número mayor");
        } else if(num2>num1 && num2>num3){
            System.out.println("el número " + num2 + " es el número mayor");
        } else {
            System.out.println("el número " + num3 + " es el número mayor");
        }
    }
}
