public class Main {
    public static void main(String[] args) {

        UnevenMatrix m1 = new UnevenMatrix();
        Float[] array1 = {1f,3f,9f,27f,729f};

        m1.loadRows(array1,0);

        Float[] array2 = new Float[5];

        for (int i = 0; i<array2.length; i++){
            array2[i] = (float) Math.floor(Math.random() * 35+14);

        }

        m1.loadRows(array2,1);

        Float[] array3 = new Float[7];
        int aux = 0;

        for (int i = 0; i<array3.length; i++){
            array3[i] = (float) Math.cos(aux);
            aux+=45;
        }
        m1.loadRows(array3, 2);

        Float[] array4 = new Float[20];
        Float previous = 0f;

    for (int i = 0; i<array4.length; i++){
        Float aux2 = previous;
    }

    Float[] array = new Float[20];
    int pos = 1;

    }
}