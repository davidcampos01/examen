
public class NewClass {

    public class NewClass1 {

        public static boolean esPrimo(int n) {
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
