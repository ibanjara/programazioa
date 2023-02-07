public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) throws FractionException {
        if (denominador == 0) {
            throw new FractionException("No se puede crear una instancia de una fracción con denominador 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;

    }

    public Fraccion sumar(Fraccion berria) throws FractionException {
            Fraccion aux = new Fraccion(numerador * berria.denominador + denominador * berria.numerador, denominador * berria.denominador);
            aux.simplificar();
            return aux;

    }
    public Fraccion restar (Fraccion berria) throws FractionException {
        Fraccion aux = new Fraccion(numerador*berria.denominador-(denominador*berria.numerador), denominador*berria.denominador);
        aux.simplificar();
        return aux;
    }

    public Fraccion multiplicar(Fraccion berria) throws FractionException {
        int totalaNum = this.numerador * berria.numerador;
        int totalaDen = this.denominador * berria.denominador;

        Fraccion resultado = new Fraccion(totalaNum, totalaDen);
        resultado.simplificar();

        return resultado;
    }

    public Fraccion dividir(Fraccion berria) throws FractionException {
        int totalaNum = this.numerador * berria.denominador;
        int totalaDen = this.denominador * berria.numerador;


        if (totalaDen == 0) {
            throw new FractionException("Esta operación da como resultado una fracción no válida");

        } else{

            Fraccion resultado = new Fraccion(totalaNum, totalaDen);
            resultado.simplificar();
            return resultado;
        }

    }

    private void simplificar() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    /*
    Metodo honek Euclides-en algoritmoa erabiltzen du.
    Adibidez, zenbakitzailea 150 bada eta denominatzailea 39:

    150/39 = 3 eta hondarra 33. Beraz horrela geratzen da:
    150 (zenbakitzailea)= 39 (denominatzailea) * 3 (emaitza) + 33 (hondarra).

    Hondarra oraindik ez da 0, beraz berriz egin behar da zatiketa 0 eman arte. Oraingoan denominatzailea hondarrarekin zatitzen da. Horregatik berriz deitzen diogu funtzioari.

    39/33 = 1 eta hondarra 6. Beraz horrela geratzen da:

    39 (zenbakitzailea) = 33 (denominatzailea) * 1 (emaitza) + 6 (hondarra). Oraindik ez da hondarra 0.

    33/6 = 5 eta hondarra 3. Oraindik ez da hondarra 0.

    6/3 = 2 eta hondarra 0.

    6 = 3 * 2 + 0. Hondarra 0 denez (b-ren balioa), Mkt 3 da eta 3 a-ren balio izango da.

    */

}
