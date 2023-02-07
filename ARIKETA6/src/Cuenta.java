public class Cuenta {
    private double dirua;
    private Pertsona informazioa;
    private boolean zenbakigorria;

    Cuenta(Pertsona informazioa){
        this.informazioa = informazioa;
    }

    public Cuenta(Pertsona informazioa, double dirua){
        this.dirua = dirua;
        this.informazioa = informazioa;
    }

    void deposito(double dirua){
        this.dirua = this.dirua + dirua;
        if(this.dirua<0){
            zenbakigorria = true;
        }else{
            zenbakigorria = false;
        }
    }

    void retiro(double dirua){
        this.dirua = this.dirua - dirua;
        if(this.dirua<dirua){
            zenbakigorria = true;
        } else{
            zenbakigorria = false;
        }
    }

    void erakutsi(){
        System.out.println("Saldoa: " + this.dirua);
        if(this.zenbakigorria){
            System.out.println("Zenbaki gorrietan zaude!");
        }else{
            System.out.println("Ez zaude zenbaki gorrietan");
        }
    }
}

