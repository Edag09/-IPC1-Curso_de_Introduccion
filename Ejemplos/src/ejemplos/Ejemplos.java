package ejemplos;
import java.util.Scanner;
public class Ejemplos {

    public static void main(String[] args) {
    int a, b, c, d, suma, multiplicacion;
    float resultado;
    double res;
    boolean bandera = true;
    Funcion funcion = new Funcion();
    Scanner sn = new Scanner(System.in);
        System.out.println("Ingresa el valor de la pimera varibale: ");
        a = sn.nextInt();
        System.out.println("Ingresa el valor de la segunda variable: ");
        b = sn.nextInt();
        do{            
           System.out.println("Ingresa el valor de la tercera variable: ");
           c = sn.nextInt();
           System.out.println("Ingresa el valor de la cuarta variable: ");
           d = sn.nextInt();
           funcion.resultado(a, b, c, d);
           /*suma = a + b;
           multiplicacion = c * d;
            if (c == 0 || d == 0) {
                System.out.println("No se puede realizar una division dentro de 0, por favor ingresa nuevamente los numeros correctos");
            }else{
                resultado = (float) suma/multiplicacion;
                res = (double) suma / multiplicacion ;
                System.out.println("El resultado es de " + resultado);
                System.out.println("El resultado es de " + res);
            }*/

        }while (c == 0 || d==0);

    }
}
