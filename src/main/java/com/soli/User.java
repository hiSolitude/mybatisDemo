package com.soli;

/**
 * Created by solitude on 2017/2/17.
 */
public class User {
    private int id;
    private String password ;
    private String userName;
    private String userAge;
    private String userAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    /*  public static void main(String[] args){
        System.out.println(User.class.getClassLoader().getResource("").toString());
    }  */
}
