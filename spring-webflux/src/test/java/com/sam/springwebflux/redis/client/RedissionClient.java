package com.sam.springwebflux.redis.client;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.api.RedissonReactiveClient;
import org.redisson.config.Config;

import java.util.Objects;

public class RedissionClient {
    private RedissonClient redissonClient;
    public RedissonClient getRedissonClient() {
        if (Objects.isNull(this.redissonClient)) {
            Config config = new Config();
            config.useSingleServer().setAddress("redis://127.0.0.1:6379");
            this.redissonClient = Redisson.create(config);


        }
        return this.redissonClient;
    }
    public RedissonReactiveClient getRedissonReactiveClient() {
        return this.getRedissonClient().reactive();
    }
}
