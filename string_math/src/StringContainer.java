public class StringContainer {

    private String katea;
    public int constant;

    StringContainer(String katea){

        this.katea = katea;

    }

    StringContainer(int constant){

        this.constant = constant;
    }

    StringContainer(){

    }

    @Override
    public String toString() {
        return this.katea.toString();
    }

    boolean isEqualTo(StringContainer a) {

        if (this.katea.equals(a.katea)) {
            return true;
        }
        return false;
    }
/*
    public void shiftRight(int zenbakia){

        String aldatuta = this.katea;
        int length=aldatuta.length();
        String answer = aldatuta.substring((length-zenbakia)%length);
        System.out.println(answer);

    }
*/
    public void shiftRight (int zenbakia){
        this.katea = this.katea.substring(zenbakia);
        for (int i = 1; i<=zenbakia; i++){
            this.katea = "-"+this.katea;
        }
        System.out.println(this.katea);
    }
    public void shiftLeft (int zenbakia){

        String aldatuta = this.katea;
        zenbakia = zenbakia%aldatuta.length();
        System.out.println(aldatuta.substring(zenbakia));
    }


    public void rotate (int zenbakia, char direction){

        if (direction == 'R'){
            String aldatuta = this.katea;
            int length=aldatuta.length();
            String answer = aldatuta.substring((length-zenbakia)%length)+aldatuta.substring(0,(length-zenbakia)%length);
            System.out.println(answer);
        }

        if (direction == 'L'){
            String aldatuta = this.katea;
            zenbakia = zenbakia%aldatuta.length();
            System.out.println(aldatuta.substring(zenbakia) + aldatuta.substring(0, zenbakia));
        }


    }
    public String codificar(int n){
        String textoCodificado = "";
        String letras = "abcdefghijklmnñopqrstuvwxyz";
        String texto = this.katea.toLowerCase();

        char caracter;
        boolean suma = true;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            int pos = letras.indexOf(caracter);

            if(pos == -1){
                textoCodificado += caracter;
            }else{
                if(suma && caracter != 'a') {
                    textoCodificado += letras.charAt((pos + n) % letras.length());
                    suma = false;
                }
                else if(suma == false && caracter != 'a'){
                    textoCodificado += letras.charAt((pos - n) % letras.length());
                    suma = true;

                }
                if (caracter == 'a' && suma == false){
                    textoCodificado += letras.charAt(letras.length()-n);
                }

            }

        }

        return textoCodificado;
    }


   public StringContainer mixWords (StringContainer a, StringContainer b){

        String aux = "";

       StringContainer res = new StringContainer(aux);

        String[] newStr1 = a.katea.toString().split(" ");
        String[] newStr2 = b.katea.toString().split(" ");

        if(newStr1.length >= newStr2.length) {

        return kateatu(res, newStr1, newStr2);

        } else{
            return kateatu(res, newStr2, newStr1);
        }
    }

    public StringContainer kateatu (StringContainer res, String[] newStr1, String[] newStr2){
        for (int i = 0; i< newStr1.length; i++){
            if (newStr2.length <= i){
                res.katea = res.katea + " " + newStr1[i];
            } else{
                res.katea = res.katea + " " + newStr1[i] + " " + newStr2[i];
            }
        }
        return res;
    }
}
