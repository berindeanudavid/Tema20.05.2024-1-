
public abstract class ContBancar implements SumaTotala{
    private String numarCont;
    private float suma;
    public ContBancar(String numarCont,float suma){
        this.numarCont=numarCont;
        this.suma=suma;
    }
    public String getNumarCont(){
        return this.numarCont;
    }
    public void setNumarCont(String numarCont){
        this.numarCont=numarCont;
    }
    public float getSuma(){
        return this.suma;
    }
    public void setSuma(float suma){
        this.suma=suma;
    }
}