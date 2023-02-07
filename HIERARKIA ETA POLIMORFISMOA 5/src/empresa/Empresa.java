package empresa;

public class Empresa {

    private String nombre;
    private double beneficio;
    private Empleado propietario;
    private Empleado gerente;

    Empresa(String nombre, double beneficio, Empleado propietario){
        this.nombre = nombre;
        this.beneficio = beneficio;
        this.propietario = propietario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getBeneficio(){
        return this.beneficio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setBeneficio(double beneficio){
        this.beneficio = beneficio;
    }

    public void hireManager(Empleado gerente){
        this.gerente = gerente;
    }

    public void trabajo(){
        propietario.trabajo();
        gerente.trabajo();
        setBeneficio(this.beneficio+100);
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Beneficio: " + getBeneficio() + ", [Gerente] -> " + gerente.toString() + ", [Propietario] -> " + propietario.toString();
    }
}
