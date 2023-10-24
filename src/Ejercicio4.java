import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Eje4= new Scanner(System.in);
        System.out.println("Ingrese los segundos: ");
        int Seg= Integer.parseInt(Eje4.nextLine());

        int Minutos= Seg/ 60;
        int Horas= Minutos/ 60;
        Minutos= Minutos% 60;
        int Segundos = Seg%60;


        System.out.println("EN horas es: "+Horas);
        System.out.println("En minutos es: "+Minutos);
        System.out.println("En segundos es: "+Segundos);



    }
}
