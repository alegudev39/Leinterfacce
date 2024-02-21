public class Rettangolo implements Forma {
    int base;
    int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @java.lang.Override
    public int calcolaArea() {
        return this.altezza * this.base;
    }

}
