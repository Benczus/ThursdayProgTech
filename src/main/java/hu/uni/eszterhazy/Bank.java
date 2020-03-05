package hu.uni.eszterhazy;

import java.util.*;

public class Bank {


    private final UUID bankID;
    private String ownerName;
    private int bankCode;
    private String location;
    private String name;
    private List<User> userAccountList= new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank bank = (Bank) o;
        return getBankCode() == bank.getBankCode() &&
                getBankID().equals(bank.getBankID()) &&
                getOwnerName().equals(bank.getOwnerName()) &&
                getLocation().equals(bank.getLocation()) &&
                getName().equals(bank.getName()) &&
                Objects.equals(getUserAccountList(), bank.getUserAccountList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBankID(), getOwnerName(), getBankCode(), getLocation(), getName(), getUserAccountList());
    }

    public UUID getBankID() {
        return bankID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBankCode() {
        return bankCode;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public List<User> getUserAccountList() {
        return userAccountList;
    }

    public Bank(UUID bankID, String ownerName, int bankCode, String location, String name) {
        this.bankID = bankID;
        this.ownerName = ownerName;
        this.bankCode = bankCode;
        this.location = location;
        this.name = name;
    }

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

    public void addNewUserAccount(String name, String location, Date birthDay){
       User newAccount= new User( UUID.randomUUID(), name, birthDay, location);
       userAccountList.add(newAccount);
    }
}
