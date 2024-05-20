public class ContBancarLei extends ContBancar{
    public ContBancarLei(String numarCont, float suma) {
        super(numarCont, suma);
    }
    public void transfer(ContBancar contDestinatie, float suma){
        contDestinatie.setSuma(contDestinatie.getSuma()+suma);
    }
    public float getSumaTotala(){
        return this.getSuma();
    }
}
