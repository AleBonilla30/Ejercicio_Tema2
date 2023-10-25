import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Variable1= new Scanner(System.in);
        System.out.println("La variable 1 es: ");
       int Var1= Variable1.nextint();

        Scanner Variable2= new Scanner(System.in);
        System.out.println("La variable dos es: ");

        int Var2=Variable2.nextint();

        System.out.println("La suma de las dos es: "+(Var1+Var2));

        System.out.println("La resta de las dos es: "+(Var1-Var2));

        System.out.println("La multiplicacion de las dos es: "+(Var1*Var2));

        System.out.println("la division entera de las dos es: "+(Var1/Var2));

        System.out.println("La division de las dos es: "+(Var1%Var2));

    }
}
