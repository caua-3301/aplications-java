package multiple;

public class MultipleSeven {
    private static final int MAX = 1000;

    public static void main(String[] args) {

        for (int control = 7; control < MAX; control+=7) {
            System.out.printf("%d ", control);
        }
    }
}
