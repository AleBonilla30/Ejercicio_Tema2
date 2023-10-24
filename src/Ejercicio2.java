import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(" Ingrese su nombre:");
        Scanner Dato= new Scanner(System.in);

        String nombre= Dato.nextLine();

        System.out.println(" Ingrese su variable1: ");
        int Variable1= Dato.nextInt();
        System.out.println(" Ingrese su variable2:");
        int Variable2= Dato.nextInt();
        System.out.println(" Ingrese su variable3:");
        int Variable3= Dato.nextInt();
        System.out.println(" Ingrese su variable4:");
        int Variable4= Dato.nextInt();
        System.out.println(" Ingrese su variable5:");
        int Variable5= Dato.nextInt();
        System.out.println("Te llamas: "+nombre);

        System.out.println(Variable1+" "+Variable2+" "+Variable3+" "+Variable4+" "+Variable5);

        int Aux= Variable1;
        Variable1=Variable2;
        Variable2=Variable3;
        Variable3=Variable4;
        Variable4=Variable5;
        Variable5=Aux;
        System.out.println(Variable1+" "+Variable2+" "+Variable3+" "+Variable4+" "+Variable5);
















    }
}
