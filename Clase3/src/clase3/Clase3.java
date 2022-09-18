package clase3;
import java.util.Scanner;
import java.lang.Math;

public class Clase3 {

    public static void main(String[] args) {
        
        //Comentario de una linea
        /*Este es un comentario
            de varias 
            lineas */

        /*double radio;
        double altura;
        double resultado;  Declaracion de variable
        double area_lateral;
        double area_base;
        double Pi = 3.14156; Declaracion con asignacion de variable
        */

        double radio, altura, resultado, area_lateral, area_base, Pi=3.14156;
        Scanner sn = new Scanner(System.in);

        /*System.out.println("Introduca el radio");
        radio = sn.nextDouble();
        System.out.println("Introduca la altura");
        altura = sn.nextDouble();*/

        /*if (radio == 0) {
            System.out.println("Ingresa nuevamente el radio");
        }else{
           if (altura == 0) {
                System.out.println("Ingresa nuevamente la altura");
            }else{
                area_lateral = Pi*radio*altura;
                area_base = Pi*(Math.pow(radio, 2));
                resultado = area_lateral+area_base;
                System.out.println("El area del cilindro es de: "+resultado);
            }
        }*/
        do{
            System.out.println("Introduca el radio");
            radio = sn.nextDouble();
            System.out.println("Introduca la altura");
            altura = sn.nextDouble();
        }while (radio == 0 || altura == 0); 
        area_lateral = Pi*radio*altura;
        area_base = Pi*(Math.pow(radio, 2));
        resultado = area_lateral+area_base;
        System.out.println("El area del cilindro es de: "+resultado);
    }
}
