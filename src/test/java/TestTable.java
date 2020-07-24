public class TestTable {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 9;
        numbers[2] = 8;
        numbers[3] = 7;
        numbers[4] = 6;
        numbers[5] = 5;
        numbers[6] = 4;
        numbers[7] = 3;
        numbers[8] = 2;
        numbers[9] = 1;

        System.out.println("pobrany argument to: " + numbers[1]);

        if ((numbers[1] % 2)==1) {
            System.out.println("liczba " + numbers[1] + " jest nieparzysta");
        } else
            System.out.println("jest parzysta");


    }
}
