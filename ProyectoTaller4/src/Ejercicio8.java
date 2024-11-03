import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIABLES
        double ntflx, yt_prm, drop_bx, spfy, v_inicial, v_total;
        int edad;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("INGRESE EL COSTO DE NETFLIX: ");
        ntflx = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DE YOUTUBE PRIME: ");
        yt_prm = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DE DROP BOX: ");
        drop_bx = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DE SPOTIFY: ");
        spfy = teclado.nextDouble();
        System.out.print("INGRESE SU EDAD: ");
        edad = teclado.nextInt();
        //PROCESAMIENTO DE DATOS DE ETRADA
        v_inicial = (ntflx + yt_prm + drop_bx + spfy);
        double desc = (edad < 30) ? v_inicial * 0.20 : 0;
        v_total = v_inicial - desc;
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("EL VALOR TOTAL A PAGAR ES DE: " + v_total);
                
    }
    
}
