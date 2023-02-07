public class Movie {
    private String titulo;
    private int minutos;
    private int año;

    public Movie(String titulo, int minutos, int año){
        this.titulo = titulo;
        this.minutos = minutos;
        this.año = año;
    }
    @Override
    public String toString(){
        return "";
    }

    public boolean isEqual(Movie pelicula){
        if(this.titulo == pelicula.titulo && (this.minutos - pelicula.minutos) < 5 && this.año == pelicula.año){
            return true;
        }
        return false;
    }
}
