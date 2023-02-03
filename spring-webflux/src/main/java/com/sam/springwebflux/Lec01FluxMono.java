package com.sam.springwebflux;

import com.sam.springwebflux.util.ConsumerUtil;
import reactor.core.publisher.Flux;

public class Lec01FluxMono {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.just(1, 2, 3, 4);
        flux.subscribe(ConsumerUtil.onNext(), ConsumerUtil.onError(), ConsumerUtil.onCompleted());
        Flux<Integer> interFlux = Flux.just(1, 2, 3, 4);
        Flux<Integer> evenInteger = interFlux.filter(integer -> integer % 2 == 0);

        interFlux.subscribe(integer -> {
           System.out.println("Sub 1:" + integer);
        });
        evenInteger.subscribe(integer -> {
            System.out.println("Sub 2:" + integer);
        });

    }
}
