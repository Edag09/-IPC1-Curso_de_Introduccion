package archivos;
import java.util.Scanner;
import java.io.File;

public class Archivos {
    public static void main(String[] args) {
        Escritura archivo = new Escritura();
        archivo.escritura();
        archivo.Lectura();
        /*String text = "";
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa la ruta de tu archivo:\n");
        text = read.nextLine();

        File fichero = new File("Entrada.txt");
        Scanner sn = null;

        try{
            System.out.println("Vamos a leer un archivo de texto\n");
            sn = new Scanner(fichero);

            while(sn.hasNextLine()){
                String line = sn.nextLine();  //Guardamos la linea en un string
                System.out.println(line);       // lo imprimimos
            }
            
        }catch(Exception error){
            System.out.println(error);
        }*/
    }
    
}
