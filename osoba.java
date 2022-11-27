public class osoba extends osobnik {

    public String imie;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "osoba{" +
                "imie='" + imie + '\'' +
                '}';
    }
}

