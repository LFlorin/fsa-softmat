package LunguFlorin;

/**
 * J7. Creati o clasa noua Automobil cu 3 caracteristici: tipMotor, tractiune, putere si 6 metode de setare si citire a celor 3 campuri.
 * Va rog sa instantiati 2 obiecte din clasa Automobil si sa-i setati si afisati caracteristicile folosind metodele declarate.
 */
public class J7 {

    public static void main(String[] args) {
        Automobil V1 = new Automobil();
        Automobil V2 = new Automobil();
        V1.setPutere(330.1);
        V1.setTipMotor("V8");
        V1.setTractiune("Spate");
        V2.setPutere(1000.2);
        V2.setTipMotor("V12");
        V2.setTractiune("4x4");
        System.out.println("V1 Putere " + V1.getPutere() + " Tip motor " + V1.getTipMotor() + " Tractiune " + V1.getTractiune());
        System.out.println("V2 Putere " + V2.getPutere() + " Tip motor " + V2.getTipMotor() + " Tractiune " + V2.getTractiune());
    }


}

class Automobil {
    private String tipMotor;
    private String tractiune;
    private double putere;

    public String getTipMotor() {
        return tipMotor;
    }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    public String getTractiune() {
        return tractiune;
    }

    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    public double getPutere() {
        return putere;
    }

    public void setPutere(double putere) {
        this.putere = putere;
    }

}
