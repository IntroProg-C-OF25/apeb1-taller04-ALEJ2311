import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIABLES
        double kilo_hora, kilo_mes, v_inicial, v_cancelar;
        int edad;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("INGRESE EL VALOR DE KILOVATIO POR HORA: ");
        kilo_hora = teclado.nextDouble();
        System.out.print("INGRESE EL NUMERO DE KILOVATIOS CONUSMIDOS EN EL MES: ");
        kilo_mes = teclado.nextDouble();
        System.out.print("INGRESE SU EDAD: ");
        edad = teclado.nextInt();
        //PROCESAMIENTO DE DATOS DE ENTRADA 
        v_inicial = (kilo_hora * kilo_mes);
        double desc = (edad > 65) ? v_inicial * 0.10 : 0;
        v_cancelar = v_inicial - desc;
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("SU TOTAL A CANCELAR ES DE: " + v_cancelar );
        
        
    }
    
}
