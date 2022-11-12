package Pokemon;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ListLegendary {
    private NodeLegendary root;
    private int tamanio;

   public ListLegendary(){
        this.root = null;
        this.tamanio = 0;
    }

    public void insert_Legendary(int correlativo, String nombre, String tipo, String region, int ps, int ata, int def, int vel, int atesp, int defesp,String rareza, String direccion_IMG){
        NodeLegendary pochemon_Legendary = new NodeLegendary(correlativo, nombre, tipo, region, ps, ata, def, vel, atesp, defesp, rareza, direccion_IMG);
        if (this.getRoot() == null){
            this.setRoot(pochemon_Legendary);
            pochemon_Legendary.setCount(tamanio);
            this.tamanio++;
        }else{
            NodeLegendary aux = this.getRoot();
            while (aux.getSig() != null) {                
                aux = aux.getSig();
            }
            aux.setSig(pochemon_Legendary);
            pochemon_Legendary.setCount(tamanio);
            this.tamanio++;
        } 
    }

     public String mostrar(){
        NodeLegendary aux = this.getRoot();
        String cadena = "";
        while (aux != null) {
            cadena += "N° Pokedex: "+aux.getCorrelativo()+" Nombre: "+aux.getNombre_pk()+"\n";
            aux = aux.getSig();
             
        }
         System.out.println(this.getTamanio());
        return cadena;
    }

    public void graphLegendary(){
        String cadena = "digraph G{\n";
        NodeLegendary aux = this.getRoot();
        int cont = 1;
        if (aux != null) {
            while(aux.getSig() != null){
                cadena = cadena + cont + "[label=\""+aux.getNombre_pk()+"\"]\n"+cont+"->"+(cont+1)+"\n";
                aux = aux.getSig();
                cont ++;
            }
            cadena = cadena + cont + "[label=\""+aux.getNombre_pk()+"\"]\n";
        }
        cadena = cadena+"}";
        try {
            FileWriter doc = new FileWriter("C:\\Users\\EduardoA\\OneDrive\\Documentos\\Curso\\MiniDex\\src\\Reportes\\Legendary.dot");
            doc.write(cadena);
            doc.close();

            String fileInputPath = "C:\\Users\\EduardoA\\OneDrive\\Documentos\\Curso\\MiniDex\\src\\Reportes\\Legendary.dot";
            String fileOutputPath = "C:\\Users\\EduardoA\\OneDrive\\Documentos\\Curso\\MiniDex\\src\\Reportes\\Legendary.pdf";

            ProcessBuilder proceso = new ProcessBuilder("dot", "-Tpdf", "-o", fileOutputPath, fileInputPath);
            proceso.redirectErrorStream( true );
            proceso.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo escribir el archivo");
        }
        
    }

    public void TableLegendary(){
        NodeLegendary aux = this.getRoot();
        String pagina = "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"+ 
                        "    <link rel=\"icon\" type=\"image/x-icon\" href=\"pikachu.png\">"+
                        "    <title>Pokedex Legendarios</title>\n" +
                        "</head>\n" +
                        "<body>\n"+
                            "<table align=\"center\" cellspacing=\"8\" border=\"5%\">\n" +
                        "        <caption style=\"font-size: 25px;\">Tabla de Pokemones Legendarios</caption>\n" +
                        "        <tr>"+
                        "            <th scope=\"row\" align=\"center\" style=\"font-size: 18px;\">Imagen</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\" >N° Pokedex</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Nombre</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Tipo</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Region</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Salud</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Ataque</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Defensa</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Velocidad</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Ataque Especial</th>\n" +
                        "            <th align=\"center\" style=\"font-size: 18px;\">Defensa Especial</th>\n" +
                        "        </tr>\n"+
                        "        <tr>\n";
        while (aux != null) {            
            pagina = pagina+"<td><img src=\""+aux.getDireccion_imagen()+"\" width=\"120\" height=\"120\"></td>\n"+
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getCorrelativo()+"</td>\n"+
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getNombre_pk()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getTipo_pk()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getRegion()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getPS()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getAta()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getDef()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getVel()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getAtEsp()+"</td>\n" +
                    "<td align=\"center\" style=\"font-size: 20px;\">"+aux.getDefEsp()+"</td>\n" +
                    "</tr>\n";
            aux = aux.getSig();
        }
        pagina = pagina+"</table>\n" +
                        "</body>\n" +
                        "</html>";
        try {
            FileWriter page = new FileWriter("C:\\Users\\EduardoA\\OneDrive\\Documentos\\Curso\\MiniDex\\src\\Reportes\\Index.html");
            page.write(pagina);
            page.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo escribir el archivo");
        }
    }

    public String regresarPKL(String rareza){
        NodeLegendary aux = this.getRoot();
        String cadena = "";
        while (aux != null) {
            cadena += "N° Pokedex: "+aux.getCorrelativo()+" Nombre: "+aux.getNombre_pk()+" Region: "+aux.getRegion()+"\n";
            aux = aux.getSig();
        }
        return cadena;
    }

    public boolean SerchLegendary(String rareza){
        NodeLegendary aux = this.getRoot();
        if (aux != null) {
            return true;
        }
        return false;
    }

    public NodeLegendary getRoot() {
        return root;
    }

    public void setRoot(NodeLegendary root) {
        this.root = root;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }


}
