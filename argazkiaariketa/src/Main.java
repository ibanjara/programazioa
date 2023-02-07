import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        FileOutputStream output = null;

        try{

            input = new FileInputStream("ariketa.jpg");
            output = new FileOutputStream("ariketacopy.jpg");

            int byteak = input.read();
            while(byteak != -1){
                System.out.println(byteak);
                output.write(byteak);
                byteak = input.read();
            }

            System.out.println("Bukatuta");
            input.close();
            output.close();

    }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    catch(IOException e){
        throw new RuntimeException(e);

    }finally{
            input.close();
            output.close();
        }
    }
}