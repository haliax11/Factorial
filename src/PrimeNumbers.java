public class PrimeNumbers {
    public static void main(String[] args) {
        int i=2;
        while (i <= 10000) {
            boolean prime = true;
            int div = i - 1;
            while (div >= 2) {
                if (i % div == 0) {
                    prime = false;

                }
                div = div - 1;
            }
            if (prime) {
                System.out.println(i);
            }
            i++;
            if (i % 1000 == 0) {
                System.out.println("----------------------------------------------");
            }
        }
    }

}