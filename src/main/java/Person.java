public class Person {
    private String navn;
    private int alder;
    private double hoejde;
    private double vaegt;

    public Person(String navn, int alder, double hoejde, double vaegt) {
        this.navn = navn;
        this.alder = alder;
        this.hoejde = hoejde;
        this.vaegt = vaegt;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public double getHoejde() {
        return hoejde;
    }

    public void setHoejde(double hoejde) {
        this.hoejde = hoejde;
    }

    public double getVaegt() {
        return vaegt;
    }

    public void setVaegt(double vaegt) {
        this.vaegt = vaegt;
    }


    public void foedselsdag() {
        alder++;
    }

    // Denne metode ønskes testet
    public double BMI() {
        double bmi = vaegt / Math.pow(hoejde, 2);
        return bmi;

    }
}

