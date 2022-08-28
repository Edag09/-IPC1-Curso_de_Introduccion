
package clase4;
import java.util.Scanner;
public class MetodosFunciones {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Metodo hijo1 = new Metodo();
        String palabra;

        System.out.println("Ingresa una palabra cualquiera");
        palabra = sn.nextLine();

        hijo1.imprimir(palabra);

        /*int vector1[] = new int[10]; //Vector delcarado
        int vector2[] = {1, 2, 3, 4}; //Vector inicializado
                               //i //j
        int matriz1[][] = new int[2][2];
        int matriz2[][] = {{1,1}, {1,2}};

        for (int i = 0; i < 4 ; i++) {
            System.out.println(vector2[i]);
        }

        String palabra = "HOLA MUNDO";
        System.out.println(palabra.toLowerCase());
        String palabra2 = "hola mundo";
        System.out.println(palabra.toUpperCase());

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            vector1[i] = i;
            System.out.println(vector1[i]);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("["+matriz2[i][j]+"]");
            }
        }

        System.out.println("");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = i;
                matriz1[i][j] = j;
                System.out.print("["+matriz1[i][j]+"]");
            }
        }
       
        int matriz[][] = new int[3][3];
        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[0][2] = 4;
        matriz[1][0] = 6;
        matriz[1][1] = 6;
        matriz[1][2] = 9;
        matriz[2][0] = 8;
        matriz[2][1] = 10;
        matriz[2][2] = 12;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
        }
*/
    }

}
