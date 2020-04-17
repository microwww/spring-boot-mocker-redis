package com.github.microwww.mock.redis.spring.boot;

import com.github.fppt.jedismock.RedisServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ConditionalOnProperty(prefix = "mocker.redis", value = "enable", havingValue = "true", matchIfMissing = true)
public class RedisServerListener {

    private static final Logger logger = LoggerFactory.getLogger(RedisServerListener.class);

    @Bean(destroyMethod = "stop")
    public RedisServer mockRedisServer(RedisProperties redisProperties) {
        RedisServer server = this.start(redisProperties);
        logger.info("Mocker Redis start :: [{}:{}], set 'server.redis.host' to match it", server.getHost(), server.getBindPort());
        return server;
    }

    public synchronized RedisServer start(RedisProperties redisProperties) {
        try {
            RedisServer server = RedisServer.newRedisServer(redisProperties.getPort());  // bind to a random port
            server.start();
            return server;
        } catch (IOException e) {
            throw new RuntimeException("Start redis error !", e);
        }
    }

}
