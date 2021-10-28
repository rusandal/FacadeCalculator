public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(sumAndMult("10", "11", bins));
    }

    public static String sumAndMult(String a, String b, BinOps binOps) {
        String sum = binOps.sum(a, b);
        String mult = binOps.mult(a, b);
        return "Сумма: " + sum + "\nПроизведение: " + mult;
    }
}