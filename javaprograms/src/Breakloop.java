public class Breakloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

    }
}
//break will exit from the loop
// continue will skip the current iteration

