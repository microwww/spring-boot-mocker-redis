# spring-boot-mocker-redis
Mocker redis for spring boot

## mocker redis
mocker redis code in [github](https://github.com/ishfid4/jedis-mock)
```
<dependency>
	<groupId>com.github.fppt</groupId>
	<artifactId>jedis-mock</artifactId>
	<version>0.1.16</version>
</dependency>
```

## spring-boot-mocker-redis

Add the maven dependency :
```
<dependency>
	<groupId>com.github.microwww</groupId>
	<artifactId>mocker-redis-spring-boot-starter</artifactId>
	<version>0.0.1</version>
</dependency>
```

You can set `mocker.jedis.enable=false` to disable it .

The embedded redis server will listener `spring.redis.port` port, and host is `0.0.0.0`, so you must set `spring.redis.host` to match this host.

