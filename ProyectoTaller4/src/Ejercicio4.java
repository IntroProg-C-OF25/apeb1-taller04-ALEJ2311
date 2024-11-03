
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIABLES
        double costoMinuto, cantidadMinutos, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("DAME COSTO POR MINUTO: ");
        costoMinuto = teclado.nextDouble();
        System.out.print("DAME LA CANTIDAD DE MINUTOS: ");
        cantidadMinutos = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTARADA
        valorPlanilla = costoMinuto * cantidadMinutos;
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("VALOR DE LA PLANILLA ES : " + valorPlanilla);        
    }
    
}
