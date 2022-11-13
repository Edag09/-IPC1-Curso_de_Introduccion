package Pokemon;

import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ListMega {
    private NodeMega root;

    public ListMega() {
        this.root = null;
    }

    public void Insert_MegaEvolution(int correlativo, String nombre, String tipo, String region, int ps, int ata, int def, int vel, int atesp, int defesp,String rareza, String direccion_IMG){
        NodeMega Megaevolucion = new NodeMega(correlativo, nombre, tipo, region, ps, ata, def, vel, atesp, defesp, rareza, direccion_IMG);
        if (this.getRoot() == null){
            this.setRoot(Megaevolucion);
        }else{
            NodeMega aux = this.getRoot();
            while (aux.getSig() != null) {                
                aux = aux.getSig();
            }
            aux.setSig(Megaevolucion);
        } 
    }

    public boolean SerchMega(String rareza){
        NodeMega aux = this.getRoot();
        if (aux != null) {
            return true;
        }
        return false;
    }
    
     public String regresarMega(String rareza){
        NodeMega aux = this.getRoot();
        String cadena = "";
        while (aux != null) {
            cadena += "N° Pokedex: "+aux.getCorrelativo()+" Nombre: "+aux.getNombre_pk()+" Region: "+aux.getRegion()+"\n";
            aux = aux.getSig();
        }
        return cadena;
    }

    public void TableMega(){
        NodeMega aux = this.getRoot();
        String pagina = "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"+ 
                        "    <link rel=\"icon\" type=\"image/x-icon\" href=\"pikachu.png\">"+
                        "    <title>Mega Evoluciones</title>\n" +
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
            FileWriter page = new FileWriter("C:\\Users\\EduardoA\\OneDrive\\Documentos\\Curso\\MiniDex\\src\\Reportes\\Megas.html");
            page.write(pagina);
            page.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo escribir el archivo");
        }
    }

    public NodeMega getRoot() {
        return root;
    }

    public void setRoot(NodeMega root) {
        this.root = root;
    }

}
