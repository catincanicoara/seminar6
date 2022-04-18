package facade;

public class DealerAuto {
    MasinaFamilie mf = null;
    MasinaElectrica me = null;
    MasinaSport ms = null;

    public DealerAuto() {
    }

    public void getDescriereMF(){
        if(mf==null){
            mf = new MasinaFamilie(true);
        }
        mf.getDescriere();
    }

    public void getDescriereMS(){
        if (ms == null) {
            ms = new MasinaSport("eleron123");
        }
        ms.getDescriere();
    }

    public void getDescriereMe(){
        if(me == null){
            me = new MasinaElectrica("incarcator3");
        }
        me.getDescriere();
    }
}
