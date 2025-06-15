public abstract class Pojazd {
    protected String nrRejestracyjny;
    protected String numerVin;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double poziomPaliwa;
    protected double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public void prowadz(double km) {
        if (km <= 0) {
            System.out.println("Nieprawidłowa liczba kilometrów.");
            return;
        }
        double potrzebnePaliwo = (spalanie / 100) * km;
        if (poziomPaliwa >= potrzebnePaliwo) {
            poziomPaliwa -= potrzebnePaliwo;
            przebieg += km;
            System.out.println("Przejechano " + km + " km.");
        } else {
            System.out.println("Za mało paliwa, aby przejechać " + km + " km.");
        }
    }

    public void zatankuj(double litry) {
        if (litry <= 0) {
            System.out.println("Nieprawidłowa ilość paliwa do zatankowania.");
            return;
        }
        poziomPaliwa += litry;
        System.out.println("Zatankowano " + litry + " litrów paliwa.");
    }

    public abstract String getTypPaliwa();

    public String toString() {
        return "Pojazd{" +
                "nrRejestracyjny='" + nrRejestracyjny + '\'' +
                ", numerVin='" + numerVin + '\'' +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                ", spalanie=" + spalanie +
                ", poziomPaliwa=" + poziomPaliwa +
                ", przebieg=" + przebieg +
                '}';
    }
}
