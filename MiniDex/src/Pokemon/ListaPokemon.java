package Pokemon;

public class ListaPokemon {
    private NodePokemon root;

    public ListaPokemon() {
        root = null;
    }

    public void insert_pochemon(int correlativo, String nombre, String tipo, String region, int ps, int ata, int def, int vel, int atesp, int defesp,String rareza, String direccion_IMG){
        NodePokemon pokemon = new NodePokemon(correlativo, nombre, tipo, region, ps, ata, def, vel, atesp, defesp, rareza, direccion_IMG);
        if(this.getRoot() == null){
            this.setRoot(pokemon);
        }else{
            NodePokemon aux = this.getRoot();
            while (aux.getSig() != null) {                
                aux = aux.getSig();
            }
            aux.setSig(pokemon);
            pokemon.setAnt(aux);
            
        }
    }

    public void mostrar(){
        NodePokemon aux = this.getRoot();
        while (aux != null) {            
            System.out.println("Correlativo: "+aux.getCorrelativo()+" Nombre: "+aux.getNombre_pk());
            aux = aux.getSig();
        }
    }

    public NodePokemon getRoot() {
        return root;
    }

    public void setRoot(NodePokemon root) {
        this.root = root;
    }

}
