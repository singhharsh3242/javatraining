public class continueclass {
    public static void main(String[] args) {
        for (int i = 1; i <= 100;i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }}
//we use % and ! kyuki ye hota hai not equal to aur odd hamesa not equal dega so jab jab odd ayega to continue ho jayega loop uske baad i print ho jayega
