public interface TypPaliwa {
    String getTypPaliwa();
}

class Diesel implements TypPaliwa {
    public String getTypPaliwa() {
        return "Diesel";
    }
}

class Benzyna implements TypPaliwa {
    public String getTypPaliwa() {
        return "Benzyna";
    }
}

class Elektryk implements TypPaliwa {
    public String getTypPaliwa() {
        return "Elektryk";
    }
}
