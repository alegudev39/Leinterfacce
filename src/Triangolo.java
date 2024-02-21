public class Triangolo implements Forma {

    int base;
    int altezza;

    public Triangolo(int base, int altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    @java.lang.Override
    public int calcolaArea() {
        return (base * altezza) / 2;
    }
}
