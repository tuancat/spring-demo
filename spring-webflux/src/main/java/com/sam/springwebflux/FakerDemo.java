package com.sam.springwebflux;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class FakerDemo {
    public static void main(String[] args) {
        for (int i =0; i< 10; i++) {
            System.out.println("fullname = " + Faker.instance().name().fullName());

        }
    }
}
