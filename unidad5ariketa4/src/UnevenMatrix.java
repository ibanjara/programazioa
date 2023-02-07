public class UnevenMatrix {

    private Float[][] nums;

    public UnevenMatrix(){
        this.nums = new Float[4][];
    }

    public void loadRows(Float[] row, int pos){
        this.nums[pos] = row;
    }

    public void displayRows(int pos){
        System.out.println("Showing row: " + pos);

        for (int i = 0; i<this.nums[pos].length; i++){
            System.out.print(nums[pos][i] + " ");
        }
    }

    public void displayMatrix(){
        System.out.println("FULL MATRIX: ");
        for (int i = 0; i<this.nums.length; i++){
            for (int j = 0; j<this.nums[i].length; j++){
                System.out.print(this.nums[i][j]);
            }
            System.out.println();
        }
    }
}
