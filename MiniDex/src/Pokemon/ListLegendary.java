package Pokemon;

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

    public String graphLegendary(){
        String cadena = "digraph G{\n";
        NodeLegendary aux = this.getRoot();
        int cont = 1;
        if (aux != null) {
            while(aux.getSig() != null){
                cadena = cadena + cont + "[label=\""+aux.getNombre_pk()+"\"]\n"+cont+"->"+(cont+1)+"\n";
                aux = aux.getSig();
                cont ++;
            }
            cadena = cadena + cont + "[label=\""+aux.getNombre_pk()+"\"]\n"+cont+"->"+(cont+1)+"\n";
        }
        cadena = cadena+"}";
        return cadena;
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
