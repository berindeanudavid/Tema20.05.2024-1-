import java.util.ArrayList;

public class Banca {
    private ArrayList<Client> clienti=new ArrayList<Client>();
    private String codBanca;
    public ArrayList<Client> getClienti(){
        return this.clienti;
    }
    public String getCodBanca(){
        return this.codBanca;
    }
    public void setCodBanca(String codBanca){
        this.codBanca=codBanca;
    }
    public void add(Client c){
        this.clienti.add(c);
    }
    public void afisareClient(String nume){
        for(Client c:clienti){
            if(c.getNume()==nume){
                c.afisare();
                break;
            }
        }
    }
}
