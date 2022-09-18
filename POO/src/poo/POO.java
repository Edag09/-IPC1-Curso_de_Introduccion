package poo;

public class POO {

    public static void main(String[] args) {
        Animal gato = new Animal();
        Animal perro = new Animal("Jeff", 2, "Golden");

        gato.setName("Michi");
        gato.setEdad(2);
        gato.setRaza("Azul ruso");

        System.out.println("El nombre del perro es " + perro.getName() + "\nEl perro tiene una edad de " + perro.getEdad() + " anios \nLa raza del perrito es de " + perro.getRaza());
        System.out.println("");

        perro.setName("Cocky");
        perro.setEdad(10);
        perro.setRaza("Cocker");

        System.out.println("El nombre del gato es " + gato.getName() + "\nEl gato tiene una edad de " + gato.getEdad() + " anios \nLa raza del gato es " + gato.getRaza());
        gato.miagar();
        System.out.println("");
        System.out.println("El nombre del perro es " + perro.getName() + "\nEl perro tiene una edad de " + perro.getEdad() + " anios \nLa raza del perrito es de " + perro.getRaza());
        perro.ladrar();
}

}
