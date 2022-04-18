package facade;

public class MasinaSport implements Automobil{
    private String eleron;

    public MasinaSport(String eleron) {
        this.eleron = eleron;
    }

    @Override
    public void getDescriere() {
        System.out.println("Autoturism electric cu eleron" + eleron);
    }
}
