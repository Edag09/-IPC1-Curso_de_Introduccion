package Pokemon;

public class NodePokemon {
    private int correlativo;
    private String nombre_pk;
    private String tipo_pk;
    private String region;
    private int PS;
    private int Ata;
    private int Def;
    private int Vel;
    private int AtEsp;
    private int DefEsp;
    private String rareza;
    private String direccion_imagen;
    private NodePokemon sig;
    private NodePokemon ant;
    private int count;

    public NodePokemon(int correlativo, String nombre_pk, String tipo_pk, String region, int PS, int Ata, int Def, int Vel, int AtEsp, int DefEsp,String rareza, String direccionimg) {
        this.correlativo = correlativo;
        this.nombre_pk = nombre_pk;
        this.tipo_pk = tipo_pk;
        this.region = region;
        this.PS = PS;
        this.Ata = Ata;
        this.Def = Def;
        this.Vel = Vel;
        this.AtEsp = AtEsp;
        this.DefEsp = DefEsp;
        this.rareza = rareza;
        this.direccion_imagen = direccionimg;
        this.sig = null;
        this.ant = null;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getNombre_pk() {
        return nombre_pk;
    }

    public void setNombre_pk(String nombre_pk) {
        this.nombre_pk = nombre_pk;
    }

    public String getTipo_pk() {
        return tipo_pk;
    }

    public void setTipo_pk(String tipo_pk) {
        this.tipo_pk = tipo_pk;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPS() {
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public int getAta() {
        return Ata;
    }

    public void setAta(int Ata) {
        this.Ata = Ata;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int Def) {
        this.Def = Def;
    }

    public int getVel() {
        return Vel;
    }

    public void setVel(int Vel) {
        this.Vel = Vel;
    }

    public int getAtEsp() {
        return AtEsp;
    }

    public void setAtEsp(int AtEsp) {
        this.AtEsp = AtEsp;
    }

    public int getDefEsp() {
        return DefEsp;
    }

    public void setDefEsp(int DefEsp) {
        this.DefEsp = DefEsp;
    }

    public NodePokemon getSig() {
        return sig;
    }

    public void setSig(NodePokemon sig) {
        this.sig = sig;
    }

    public NodePokemon getAnt() {
        return ant;
    }

    public void setAnt(NodePokemon ant) {
        this.ant = ant;
    }

    public String getDireccion_imagen() {
        return direccion_imagen;
    }

    public void setDireccion_imagen(String direccion_imagen) {
        this.direccion_imagen = direccion_imagen;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
