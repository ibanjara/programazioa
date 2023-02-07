import java.lang.reflect.Array;

public class NumberStatistics {

    double [] array;
    public NumberStatistics(int tamaina){
        array = new double[tamaina];

        for (int i = 0; i<array.length; i++) {
            array[i] = 0;
        }
    }

    public void addNumber (double zenbakia){
       array[amountOfNumbers()]=zenbakia;
    }


    public int amountOfNumbers(){
            int kont = 0;
            for (int i = 0; i<array.length; i++) {
                if (array[i] != 0) {
                    kont++;
                }
            }

        return kont;
    }
    public double showStatistics(){
    double gehiketaBB = 0;
    for (int i = 0; i<array.length; i++){

        gehiketaBB+=array[i];
    }
        return gehiketaBB/amountOfNumbers();
        }
}
