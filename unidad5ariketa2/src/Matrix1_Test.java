public class Matrix1_Test {

    public static void main(String[] args) {
        Matrix1 m1 = new Matrix1(4,4);
        m1.loadByRows();
        m1.display();
        m1.reverseRows();
        System.out.println();
        m1.display();
        m1.swapRows(1,3);
        System.out.println();
        m1.display();
        System.out.println();
        m1.swapColumns(1,2);
        m1.display();
    }
}
