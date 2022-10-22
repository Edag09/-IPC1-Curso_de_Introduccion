package archivos;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class Escritura {

    String global = "";
    void escritura(){
        String cadena = "";
        Scanner glob = new Scanner(System.in);
        System.out.println("Ingresa el nombre que le quieres poner a tu archivo\n");
        global = glob.nextLine();
        try{
            FileWriter fichero = new FileWriter("C:\\Users\\EduardoA\\OneDrive\\Escritorio\\Archivos Generados\\"+global+".txt");
            cadena = "Este arhivo se escribio en el escritorio y se abrira desde el escritorio";
            fichero.write(cadena);
            fichero.close();
            System.out.println("El archivo se ha escrito con exito!");
        }catch(Exception ex){
            System.out.println("No se ha podido escribir el archivo");
        }
    }

    void Lectura(){
        File fichero = new File("C:\\Users\\EduardoA\\OneDrive\\Escritorio\\Archivos Generados\\"+global+".txt");
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
        }
    }
}
