package angajat;

public class Angajat {

    private String nume;
    private String prenume;
    private String email;

    public Angajat(String nume,String prenume,String email){
        this.nume=nume;
        this.prenume=prenume;
        this.email=email;
    }

    public String toString(){
        return nume+" "+prenume+" are adresa de email "+email+".";
    }
}
