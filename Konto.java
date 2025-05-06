public class Konto {
    private String numerKonta;
    private double saldo;
    private String wlasciciel;
    private String email;
    private String numerTelefonu;
    
  
    public Konto(String numerKonta, String wlasciciel, String email, String numerTelefonu, double saldoPoczatkowe) {
        this.numerKonta = numerKonta;
        this.wlasciciel = wlasciciel;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
        this.saldo = saldoPoczatkowe;
    }
    
    public String getNumerKonta() {
        return numerKonta;
    }
    
    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getWlasciciel() {
        return wlasciciel;
    }
    
    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNumerTelefonu() {
        return numerTelefonu;
    }
    
    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }
    
    public void deposit(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
            System.out.println("Wpłacono PLN " + kwota + " na konto.");
            System.out.println("Nowe saldo = PLN " + saldo);
        } else {
            System.out.println("Nieprawidłowa kwota wpłaty. Kwota musi być większa od 0.");
        }
    }
    
    public void withdraw(double kwota) {
        if (kwota > 0) {
            if (saldo >= kwota) {
                saldo -= kwota;
                System.out.println("Pobrano PLN " + kwota + " z konta. Pozostałe saldo = PLN " + saldo);
            } else {
                System.out.println("Brak środków. Masz PLN " + saldo + " na koncie.");
            }
        } else {
            System.out.println("Nieprawidłowa kwota wypłaty. Kwota musi być większa od 0.");
        }
    }
    
    public void showInfo() {
        System.out.println("Informacje o koncie:");
        System.out.println("Numer konta: " + numerKonta);
        System.out.println("Właściciel: " + wlasciciel);
        System.out.println("Email: " + email);
        System.out.println("Numer telefonu: " + numerTelefonu);
        System.out.println("Saldo: PLN " + saldo);
    }
}