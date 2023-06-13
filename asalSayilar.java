package odevler;

public class asalSayilar {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasindaki asal sayilar:");

        for (int number = 2; number <= 100; number++) {
            boolean asalMi = true;// asalMi=isPrime

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(number + " ");
            }
        }
    }
}
