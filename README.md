# spring-boot-mocker-redis
Mocker redis for spring boot

## mocker redis

```
            <dependency>
                <groupId>com.github.fppt</groupId>
                <artifactId>jedis-mock</artifactId>
                <version>${jedis-mock.version}</version>
            </dependency>
```
You can set `mocker.jedis.enable=false` to disable it .

The embedded redis server will listener `spring.redis.port` port, and host is `0.0.0.0`, so you must set `spring.redis.host` to match this host.

## Using
maven add the dependency :
```
<dependency>
	<groupId>com.github.microwww</groupId>
	<artifactId>mocker-redis-spring-boot-starter</artifactId>
	<version>0.0.1</version>
</dependency>
```
