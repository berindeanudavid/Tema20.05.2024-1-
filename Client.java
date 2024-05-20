public class Client {
    private String nume;
    private String adresa;
    private ContBancar[] conturi=new ContBancar[5];
    public Client(String nume, String adresa, ContBancar[] conturi){
        this.nume=nume;
        this.adresa=adresa;
        for(int i=0;i<5;i++){
            this.conturi[i]=conturi[i];
        }
    }
    public ContBancar[] getConturi(){
        return this.conturi;
    }
    public String getAdresa(){
        return this.adresa;
    }
    public void setAdresa(String adresa){
        this.adresa=adresa;
    }
    public String getNume(){
        return this.nume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void afisare(){
        System.out.println(this.getClass().getName()+": "+this.nume+", cu adresa: "+this.adresa+"\n");
        int i=0;
        while(conturi[i]!=null){
            System.out.println(conturi[i].getSuma()+"\n");
        }
    }
}
