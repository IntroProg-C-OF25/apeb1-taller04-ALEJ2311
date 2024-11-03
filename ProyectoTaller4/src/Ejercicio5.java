import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        //DECALARION DE DATOS O VARIABLES
        double gpu, tcl, pantalla, raton, c_total;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("INGRESE EL PRECIO DE LA GPU: ");
        gpu = teclado.nextDouble();
        System.out.print("DAME EL PRECIO DEL TECLADO: ");
        tcl = teclado.nextDouble();
        System.out.print("DAME EL PRECIO DE LA PANTALLA: ");
        pantalla = teclado.nextDouble();
        System.out.print("DAME EL PRECIO DEL RATON: ");
        raton = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        c_total = (gpu + tcl + pantalla + raton);
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("EL COSTO TOTAL DE LA COMPUTADORA ES: " + c_total );
        
    }
   
}
