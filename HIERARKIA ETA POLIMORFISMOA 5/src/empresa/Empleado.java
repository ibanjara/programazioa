package empresa;

public class Empleado extends Persona{
    private MobilePhone movil;
    private double dinero;

    Empleado(String nombre, String dni, int altura, int peso, double dinero, MobilePhone movil){
        super(nombre, dni, altura, peso);
        this.dinero = dinero;
        this.movil = movil;
    }
    public double getDinero(){
        return this.dinero;
    }
    public void setDinero(double dinero){
        this.dinero = dinero;
    }

    public void earnMoney(double dinero){
        setDinero(this.dinero + dinero);
    }

    public void spendMoney(double dinero){
        setDinero(this.dinero - dinero);
    }

    @Override
    public String toString() {
        return super.toString() + ", Dinero: " + getDinero() + ", Bateria: " + movil.getBateria();
    }

    public void trabajo(){
        setDinero(this.dinero + 10);
        movil.use();
    }

}
