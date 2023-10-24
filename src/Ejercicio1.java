import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Nombre= new Scanner(System.in);
        System.out.println("Introduce tu Nombre Completo: ");
        String Nom= Nombre.nextLine();


        System.out.println("Introduce Direccion: ");
        String Direc= Nombre.nextLine();


        System.out.println("Introduce Codigo Postal: ");
        int CodigoPostal= Integer.parseInt(Nombre.nextLine());


        System.out.println("Introduce Provincia y Pais: ");
        String Pais1= Nombre.nextLine();


    }
}
