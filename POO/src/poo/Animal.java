package poo;

public class Animal {

    private String name;
    private int edad;
    private String raza;

    public Animal(String name, int edad, String raza) {
        this.name = name;
        this.edad = edad;
        this.raza = raza;
    }

    public Animal(){
    
    }

    void ladrar(){
        System.out.println("The dog say guau");
    }

    void miagar(){
        System.out.println("The cat say miau");
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



}
