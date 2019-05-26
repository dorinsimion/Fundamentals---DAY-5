public class Main {
    public static void main(String[] args) {
        Angajat a = new Angajat("Ana");
        a.setName("Alice");
        a=new Angajat("Dan");

        final Angajat a2 = new Angajat("Ana");
        a2.setName("Alice");
        a2= new Angajat("Dan"); // nu compileaza
    }
}
