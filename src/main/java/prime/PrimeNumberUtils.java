package prime;

import prime.Exepction.MyExepction;

public class PrimeNumberUtils {
    public PrimeNumberUtils() {
    }

    public static boolean isPrime(int number) throws MyExepction{

        if (number < 2) {
            throw new  MyExepction("Value is less then 2");

        }


        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLesThenTwo(int number) throws MyExepction {

        if (number < 2) {
            return true;
        }else throw new  MyExepction("Value is to high");


    }
}
