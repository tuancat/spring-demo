package com.sam.springwebflux;

import com.sam.springwebflux.util.ConsumerUtil;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class MonoEmptyOrError {
    public static void main(String[] args) {
        userRepo(1).subscribe(s -> System.out.println("value = " + s));
        userRepo(2).subscribe(
                ConsumerUtil.onNext(),
                ConsumerUtil.onError(),
                ConsumerUtil.onCompleted()
        );
        userRepo(3).subscribe(
                ConsumerUtil.onNext(),
                ConsumerUtil.onError(),
                ConsumerUtil.onCompleted()
        );
    }
    private static Mono<String> userRepo(int userId) {
        if (userId == 1) {
            return Mono.just(ConsumerUtil.getFaker().name().fullName());
        } else if(userId == 2) {
            return Mono.empty();
        } else {
            return Mono.error(new RuntimeException());
        }
    }
}
