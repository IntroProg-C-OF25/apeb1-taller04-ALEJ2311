import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIBALES
        double m_prestamo, inte_mensual, p_mensual;
        int meses_pl = 12;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("INGRESE EL MONTO DEL PRESTAMO: ");
        m_prestamo = teclado.nextDouble();
        System.out.print("INGRESE EL INTERES MENSUAL: ");
        inte_mensual = teclado.nextDouble() / 100;
        //PROCESAMIENTO DE DATOS DE ENTRADA
        p_mensual = (inte_mensual * m_prestamo) / (1 - Math.pow(1 + inte_mensual, - meses_pl));
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("EL PAGO MENSUAL DEL PRESTAMO ES DE: " + p_mensual);
        
    }
    
}
