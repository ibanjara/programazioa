import java.util.ArrayList;

public class Cinema {
    private String nombre;
    private ArrayList<Movie> pelikulak;
    private Movie[] busyrooms;
    private int salas;

    public Cinema(String nombre, int salas){
        this.nombre = nombre;
        this.salas = salas;
        this.pelikulak = new ArrayList<Movie>();
        this.busyrooms = new Movie[salas];
    }

    public void roomOfMovie(String nombre, int duracion, int año){
        Movie pelikula = new Movie(nombre, duracion, año);

        for (int i = 0; i<busyrooms.length; i++){
            if(busyrooms[i].isEqual(pelikula)){
                System.out.println(busyrooms[i]);
            }
            else{
                System.out.println("La pelicula no se esta proyectando en ninguna sala");
            }
        }
    }

    public void addMovie(Movie pelikula){

        for (int i = 0; i< pelikulak.size(); i++){
            if(pelikulak.get(i) == null){
                pelikulak.add(i, pelikula);
            }  else if (pelikulak.get(i) != null){
                System.out.println("La sala esta ocupada");
            } else if (pelikulak.get(i).isEqual(pelikula)){
                System.out.println("La pelicula ya existe.");
            }
        }
    }

    public void addMovie(Movie pelikula, int sala){

            if(pelikulak.get(sala) == null){
                pelikulak.add(sala, pelikula);
            } else{
                System.out.println("La sala esta ocupada");
            }
            if(pelikulak.get(sala).isEqual(pelikula)){
                System.out.println("La pelicula ya existe.");
            }
    }

    public void display() {
        System.out.println(this.nombre);
        for (int i = 0; i < pelikulak.size(); i++) {
            if (pelikulak.get(i) != null) {
                System.out.println(pelikulak.get(i));
            }
        }
    }

    public void remove
}
