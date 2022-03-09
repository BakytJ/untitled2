package com.company;

public class Main {

    public static void main(String[] args) {
	// tapshyrma 13-sabak
        Student student = new Student();
        student.setName("Bakyt");
        System.out.println(student.getName());
        student.setSirname("Jumash");
        System.out.println(student.getSirname());
        student.setEmail("bakyt_jumash@mail.ru");
        System.out.println(student.getEmail());
        student.setAge(45);
        System.out.println(student.getAge());
    }
}
