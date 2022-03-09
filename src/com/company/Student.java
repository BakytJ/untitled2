package com.company;

public class Student {
    private String name;
    private String sirname;
    private String email;
    private int age;

    void setName(String aty){ // Bakyt
      this.name=aty;

    }
    void setSirname(String familiyasy) {
        this.sirname=familiyasy;
    }
    void setAge(int age) {
        this.age=age;
        if (age<16 || age>40) {
            System.out.println("Studenttin jashy dal kelbeyt");
        } else {
            this.age=age;
        }
    }
    void setEmail(String email){
        this.email=email;
    }
    String getName(){
        return name;
    }
    String getSirname(){
        return sirname;
    }
    String getEmail(){
        return email;
    }
    int getAge(){
        return age;
    }
}
