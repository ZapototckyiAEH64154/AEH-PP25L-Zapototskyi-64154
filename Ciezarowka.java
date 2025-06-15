public class Ciezarowka extends Pojazd {
    private double ladownosc;
    private TypPaliwa silnik;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                      double poziomPaliwa, double przebieg, double ladownosc, TypPaliwa silnik) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
        this.silnik = silnik;
    }

    @Override
    public String getTypPaliwa() {
        return silnik.getTypPaliwa();
    }

    @Override
    public String toString() {
        return super.toString() + ", ladownosc=" + ladownosc + ", typPaliwa=" + getTypPaliwa();
    }
}
