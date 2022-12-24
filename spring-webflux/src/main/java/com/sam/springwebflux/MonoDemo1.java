package com.sam.springwebflux;

import com.sam.springwebflux.util.ConsumerUtil;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

public class MonoDemo1 {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just("ball").map(String::length).map(l -> l/1);
        mono.subscribe(
                ConsumerUtil.onNext(),
                ConsumerUtil.onError(),
                ConsumerUtil.onCompleted()
        );
    }
}
