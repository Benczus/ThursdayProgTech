package hu.uni.eszterhazy;

import java.util.Random;
import java.util.UUID;

public class Bank {


    private final UUID bankID;
    private String ownerName;
    private int bankCode;
    private String location;
    private String name;

    public Bank(UUID bankID, String name, String location, String ownerName, int bankCode) {
    this.bankID=bankID;
    this.name=name;
    this.location=location;
    this.ownerName=ownerName;
    this.bankCode=bankCode;
    }

    public static int generateNewBankCode() {

        return (int) (Math.random()*1000);
    }
}
