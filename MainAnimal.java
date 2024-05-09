public class MainAnimal {
public static void main(String[] args) {
    Perro  perro = new Perro("max", "croqueta", 3, "bordercollie");
    Gato gato = new Gato("garfield", "lasana", 4, "naranja");
    System.out.println("----------------------------------------------------------------------");
    System.out.println(perro.toString());
    System.out.println("----------------------------------------------------------------------");
    System.out.println(gato.toString());
}
}