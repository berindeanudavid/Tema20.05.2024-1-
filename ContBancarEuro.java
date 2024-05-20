public class ContBancarEuro extends ContBancar{
    public ContBancarEuro(String numarCont, float suma) {
        super(numarCont, suma);
    }
    public float getDobanda(){
        if(this.getSuma()>500){
            return (float)0.3;
        }
        return 0;
    }
    public float getSumaTotala(){
        return this.getSuma()*(float)36.000;
    }
}
