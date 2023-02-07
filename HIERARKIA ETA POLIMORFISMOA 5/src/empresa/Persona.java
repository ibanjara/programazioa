package empresa;

public class Persona {

    private String nombre;
    private String dni;
    private int altura;
    private int peso;

    Persona(String nombre, String dni, int altura, int peso){
        this.nombre = nombre;
        this.dni = dni;
        this.altura = altura;
        this. peso= peso;
    }

    Persona(String dni){
        this.nombre = "null";
        this.altura = 0;
        this.peso = 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDni(){
        return this.dni;
    }

    public int getAltura(){
        return this.altura;
    }

    public int getPeso(){
        return this.peso;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Peso: " + getPeso();
    }

}
