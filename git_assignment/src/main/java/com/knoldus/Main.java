package com.knoldus;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person.getName() + " is an adult: " + person.isAdult());
    }
}