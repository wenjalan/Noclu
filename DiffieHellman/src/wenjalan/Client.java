package wenjalan;

import java.util.Random;

public class Client {

    // shared info between client and server
    private int mod;
    private int base;
    private int secret;
    private int sharedKey;
    private int secretKey;

    public Client (int mod, int base) {
        this.mod = mod;
        this.base = base;
        this.secret = new Random().nextInt(Integer.MAX_VALUE);
        this.sharedKey = base ^ secret % mod;
    }

    // returns the shared key
    // Key = base ^ secret % mod
    public int getSharedKey() {
        return sharedKey;
    }

    // computes secret key given other shared key
    public void setSecretKey(int sharedKey) {
        this.secretKey = sharedKey ^ secret % mod;
    }

    // gets the secret key
    public int getSecretKey() {
        return this.secretKey;
    }

}
