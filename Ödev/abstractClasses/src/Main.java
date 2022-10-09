public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new KidsGameCalculator();
    }
}