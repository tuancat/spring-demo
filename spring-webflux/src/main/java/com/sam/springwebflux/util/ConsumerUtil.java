package com.sam.springwebflux.util;

import com.github.javafaker.Faker;

import java.util.function.Consumer;

public class ConsumerUtil {

    private static Faker faker = Faker.instance();
    public static Consumer<Object> onNext() {
        return s -> System.out.println("received:" + s);
    }
    public static Consumer<Throwable> onError() {
        return throwable -> System.err.println("ERROR:" + throwable.getMessage());
    }
    public static Runnable onCompleted() {
        return () -> {
          System.out.println("Completed");
        };
    }

    public static Faker getFaker() {
        if (faker == null) {
            faker = Faker.instance();
        }
        return faker;
    }
}
