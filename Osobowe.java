public class Osobowe extends Pojazd {
    private int liczbaDrzwi;
    private TypPaliwa silnik;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                   double poziomPaliwa, double przebieg, int liczbaDrzwi, TypPaliwa silnik) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
        this.silnik = silnik;
    }

    @Override
    public String getTypPaliwa() {
        return silnik.getTypPaliwa();
    }

    @Override
    public String toString() {
        return super.toString() + ", liczbaDrzwi=" + liczbaDrzwi + ", typPaliwa=" + getTypPaliwa();
    }
}
