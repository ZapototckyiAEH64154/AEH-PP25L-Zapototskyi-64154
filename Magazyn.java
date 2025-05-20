public class Magazyn {

    private int numerMagazynu;
    private int dostepnaPrzestrzen;
    private String nazwaWlasciciela;
    private String email;
    private String numerTelefonu;


    public Magazyn(int numerMagazynu, int dostepnaPrzestrzen, String nazwaWlasciciela, String email, String numerTelefonu) {
        this.numerMagazynu = numerMagazynu;
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }


    public int getNumerMagazynu() {
        return numerMagazynu;
    }

    public int getDostepnaPrzestrzen() {
        return dostepnaPrzestrzen;
    }

    public String getNazwaWlasciciela() {
        return nazwaWlasciciela;
    }

    public String getEmail() {
        return email;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

  
    public void setNumerMagazynu(int numerMagazynu) {
        this.numerMagazynu = numerMagazynu;
    }

    public void setDostepnaPrzestrzen(int dostepnaPrzestrzen) {
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
    }

    public void setNazwaWlasciciela(String nazwaWlasciciela) {
        this.nazwaWlasciciela = nazwaWlasciciela;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }


    public void dodajTowar(int iloscJednostek) {
        if (iloscJednostek <= dostepnaPrzestrzen) {
            dostepnaPrzestrzen -= iloscJednostek;
            System.out.println("Dodano " + iloscJednostek + " jednostek towaru. Pozostała przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
        } else {
            System.out.println("Za mało miejsca w magazynie. Pozostała przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
        }
    }

   
    public void usunTowar(int iloscJednostek) {
        dostepnaPrzestrzen += iloscJednostek;
        System.out.println("Usunięto " + iloscJednostek + " jednostek towaru. Pozostała przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
    }


    public boolean sprawdzCzyZajete(int iloscJednostek) {
        if (iloscJednostek <= dostepnaPrzestrzen) {
            System.out.println("Jest miejsce na " + iloscJednostek + " jednostek towaru. Dostępna przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
            return true;
        } else {
            System.out.println("Brak miejsca na " + iloscJednostek + " jednostek towaru. Dostępna przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
            return false;
        }
    }

    public void aktualizujKontakt(String nowyEmail, String nowyNumerTelefonu) {
        this.email = nowyEmail;
        this.numerTelefonu = nowyNumerTelefonu;
        System.out.println("Zaktualizowano dane kontaktowe właściciela.");
        System.out.println("Nowy email: " + nowyEmail);
        System.out.println("Nowy numer telefonu: " + nowyNumerTelefonu);
    }

    public void wyswietlInformacje() {
        System.out.println("Informacje o magazynie:");
        System.out.println("Numer magazynu: " + numerMagazynu);
        System.out.println("Dostępna przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek");
        System.out.println("Nazwa właściciela: " + nazwaWlasciciela);
        System.out.println("Email właściciela: " + email);
        System.out.println("Numer telefonu właściciela: " + numerTelefonu);
    }
}