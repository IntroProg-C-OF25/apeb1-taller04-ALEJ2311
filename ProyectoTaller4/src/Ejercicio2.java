import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //DECLARACION  DE DATOS O VARIABLES
        double hijo1, hijo2, hijo3, g_total;
        Scanner teclado = new Scanner(System.in); //PARA INGRESAR VALORES POR CONSOLA
        //INGRESO DE DATOS DE ENTRADA 
        System.out.print("DAME EL GASTO DEL PRIMER HIJO: ");
        hijo1 = teclado.nextDouble();
        System.out.print("DAME EL GASTO DEL SEGUNDO HIJO: ");
        hijo2 = teclado.nextDouble();
        System.out.print("DAME EL GASTO DEL TERCER HIJO: ");
        hijo3 = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        g_total = (hijo1 + hijo2 +hijo3);
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("EL GASTO TOTAL DE LOS HIJOS ES DE: " + g_total );
        
    }
   
}
