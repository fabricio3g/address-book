package com.example.demo;

public class Address {
    private String id;
    private String email;
    private String address_1;
    private String address_2;
    private String phone;
    private String city;
    private String state;
    private String zip;
    

    public String getId(){
        return id;
    }
   

    public void setId(String id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }
   

    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress_1(){
        return address_1;
    }

    public void setAddress_1(String address_1){
        this.address_1 = address_1;
    }

    public String getAddress_2(){
        return address_2;
    }

    public void setAddress_2(String address_2){
        this.address_2 = address_2;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getZip(){
        return zip;
    }

    public void setZip(String zip){
        this.zip = zip;
    }
}
