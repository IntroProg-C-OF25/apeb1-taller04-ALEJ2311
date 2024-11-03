
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIABLES
        double lado_cua, altu_tri, area_cua, area_tri, area_rec, area_to;
        Scanner teclado = new Scanner(System.in);
        //IINGRESO DE DATOS DE ENTRADA
        System.out.print("INGRESE EL LADO DEL CUADRADO: ");
        lado_cua = teclado.nextDouble();
        System.out.print("DAME LA ALTURA DEL TRIANGULO: ");
        altu_tri = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        area_cua = Math.pow(lado_cua, 2);
        area_tri = (lado_cua * altu_tri) / 2;
        area_rec = (lado_cua * altu_tri);
        area_to = area_cua + (area_tri * 3) + area_rec;
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("EL AREA TOTAL DEL POLIGONO ES  = " + area_to );
        
                
    }
    
}
