package Pokemon;

import javax.swing.JOptionPane;

public class ListaPokemon {
    private NodePokemon root;
    public ListLegendary legendario;

    public ListaPokemon() {
        root = null;
        this.legendario = new ListLegendary();
    }

    public void insert_pochemon(int correlativo, String nombre, String tipo, String region, int ps, int ata, int def, int vel, int atesp, int defesp,String rareza, String direccion_IMG){
        NodePokemon pokemon = new NodePokemon(correlativo, nombre, tipo, region, ps, ata, def, vel, atesp, defesp, rareza, direccion_IMG);
        if(this.getRoot() == null){
            this.setRoot(pokemon);
            inserLegendari(pokemon, pokemon.getRareza());
        }else{
            NodePokemon aux = this.getRoot();
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            inserLegendari(pokemon, pokemon.getRareza());
            aux.setSig(pokemon);
            pokemon.setAnt(aux);
        }
    }

    public String mostrar(){
        NodePokemon aux = this.getRoot();
        String cadena = "";
        while (aux != null) {
            cadena += "N° Pokedex: "+aux.getCorrelativo()+" Nombre: "+aux.getNombre_pk()+"\n";
            aux = aux.getSig();
             
        }
        return cadena;
    }


    public NodePokemon regresarPK(int numero){
        NodePokemon aux = this.getRoot();
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "No hay ningun pokemon registrado");
        }else{
            while(aux != null){
                if (numero != aux.getCorrelativo()) {
                    aux = aux.getSig();
                }else{
                    return aux;
                }
            }
        }
        return null;
    }

    public boolean busqueda(int num){
        NodePokemon aux = this.getRoot();
        if (aux != null) {
            regresarPK(num);
        }else{
            return false;
        }
      return true;
    }

    public void inserLegendari(NodePokemon pochemon, String rareza){
        if (rareza.equals("Legendario")) {
            this.legendario.insert_Legendary(pochemon.getCorrelativo(), pochemon.getNombre_pk(), pochemon.getTipo_pk(), pochemon.getRegion(), pochemon.getPS(), pochemon.getAta(), pochemon.getDef(), pochemon.getVel(), pochemon.getAtEsp(), pochemon.getDefEsp(), pochemon.getRareza(), pochemon.getDireccion_imagen());
        }
    }

    public NodePokemon getRoot() {
        return root;
    }

    public void setRoot(NodePokemon root) {
        this.root = root;
    }

}
