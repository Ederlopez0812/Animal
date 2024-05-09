public class Gato extends Animal {

    private String raza; 
    public Gato( String nombre,String tipo_de_alimentacion,int edad, String raza){
        super(nombre,tipo_de_alimentacion,edad);
        this.raza =raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}