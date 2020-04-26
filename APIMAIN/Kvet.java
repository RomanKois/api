package APIMAIN;

public class Kvet {
    private String nazov;
    private String typ;
    private int cena;
    private int pocetKusov;

    Kvet(String nazov, String typ,int cena, int pocetKusov) {
        this.nazov = nazov;
        this.typ = typ;
        this.cena = cena;
        this.pocetKusov = pocetKusov;
        }

        public String getNazov() {
        return nazov;
    }
    
    public String getTyp() {
        return typ;
    }

    public int getCena() {
        return cena;
    }

    public int getPocetKusov() {
        return pocetKusov;
    }

    public void setPocetKusov(int pocetKusov) {
        this.pocetKusov = pocetKusov;
    }
}

