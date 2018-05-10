package wenjalan;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // get a large, random prime number to use as the modulus
        int p = getPrimeNumber();

        // shared info
        int g = 3; // base

        // create a client and server
        Client c = new Client(p, g);
        Server s = new Server(p, g);

        // generate secret keys
        c.setSecretKey(s.getSharedKey());
        s.setSecretKey(c.getSharedKey());

        // print keys
        System.out.println(c.getSecretKey());
        System.out.println(s.getSecretKey());
    }

    // TODO: Make it generate a large, random prime number
    public static int getPrimeNumber() {
        return 283;
    }

    // generates a random prime number, up to n
    public static int generatePrimeNumber(int range) {
        // create an array with values from 2 to range
        int[] numbers = new int[range];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        // anything set to -1 is not a prime
        numbers[0] = -1;
        numbers[1] = -1;
    }

}
