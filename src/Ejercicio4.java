import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una letra");
        var letra = scanner.next().charAt(0);
        if(Character.isUpperCase(letra)){
            System.out.println("la letra " + letra + " es mayuscula");
        }else if(Character.isLowerCase(letra)){
            System.out.println("la letra " + letra + " es minuscula");
        }
    }
}
