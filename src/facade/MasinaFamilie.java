package facade;

public class MasinaFamilie implements Automobil{
    private boolean scaunCopil;

    public MasinaFamilie(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
    }

    @Override
    public void getDescriere() {
        if(scaunCopil){
            System.out.println("Autoturismul are scaun pentru copil!");
        } else{
            System.out.println("Autoturismul nu are scaun pentru copil!");
        }
    }
}
