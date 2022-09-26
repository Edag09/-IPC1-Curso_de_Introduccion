package poo;

public class Animal {

    private String name;
    private int edad;
    private String raza;
    private String nombreCientifico;

    public Animal(String name, int edad, String raza, String NC) {
        this.name = name;
        this.edad = edad;
        this.raza = raza;
        this.nombreCientifico = NC;
    }

    public Animal(){
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

}
