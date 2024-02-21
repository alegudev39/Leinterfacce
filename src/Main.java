public class Main {
    public static void main(String[] args) {


        Rettangolo rettangolo = new Rettangolo(2, 2);
        Triangolo triangolo = new Triangolo(9, 3);


        System.out.println("Hello world!");
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());


    }
}