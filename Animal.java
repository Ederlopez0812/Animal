public class Animal {

   private String raza;
    private String nombre;
    private int edad; 
    private String tipo_de_alimentacion;
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTipo_de_alimentacion() {
        return tipo_de_alimentacion;
    }
    public void setTipo_de_alimentacion(String tipo_de_alimentacion) {
        this.tipo_de_alimentacion = tipo_de_alimentacion;
    }
    public Animal(String nombre,String tipo_de_alimentacion, int edad){
        this.nombre = nombre;
        this.tipo_de_alimentacion = tipo_de_alimentacion;
        this.edad = edad;

    }
    @Override
    public String toString() {
        return "Animal [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", tipo_de_alimentacion="
                + tipo_de_alimentacion + "]";
    }
    

}