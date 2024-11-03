import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES O DATOS
        int numero, resultado; 
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("INGRESE UN NUMERO ENTRE 2 Y 6: ");
        numero = teclado.nextInt();
        //PROCESAMIENTO DE DATOS DE ENTRADA 
        if(numero >= 2 && numero <= 6){
             System.out.println("Tabla de multiplicar del :" + numero);
             for(int i = 1; i <=10; i++) { 
                 resultado = numero * i;
                 //PRESENTACIÓN DE DATOS DE SALIDA
                 System.out.println(numero + "x" + i + " = " + resultado);
             }
        }
        else{
             System.out.println("EL NUMERO NO ESTA ENTRE 2 Y 6");
        }
    }
    
}
