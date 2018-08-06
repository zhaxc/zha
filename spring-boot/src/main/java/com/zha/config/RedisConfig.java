package com.zha.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;
import java.time.Duration;

/**
 * Created by zha on 2018/8/3.
 */
@Configuration
@EnableCaching
//@AutoConfigureAfter(RedisAutoConfiguration.class)
public class RedisConfig extends CachingConfigurerSupport{

    /**
     * 缓存Key生成器 配置
     * @return
     */
    @Bean
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {

            /**
             * Generate a key for the given method and its parameters.
             * 根据目标方法和参数生成key  【类全路径.方法名-参数】
             * @param target the target instance      目标实例
             * @param method the method being called   目标方法
             * @param params the method parameters (with any var-args expanded) 目标参数
             * @return a generated key
             */
            @Override
            public Object generate(Object target, Method method, Object... params) {

                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName()).append(".").append(method.getName());
                for (Object param : params) {
                    sb.append("-").append(param.toString());
                }
                return sb.toString();

            }

        };
    }

    /**
     * 缓存管理器 二进制存储
     * @param factory
     * @return
     */
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Bean
    public CacheManager cacheManager(LettuceConnectionFactory factory) {

        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofHours(1)); // 设置缓存有效期一小时
        return RedisCacheManager
                .builder(RedisCacheWriter.nonLockingRedisCacheWriter(factory))
                .cacheDefaults(redisCacheConfiguration).build();
    }

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Bean
    public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory factory) {

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);

        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);

        StringRedisSerializer stringSerializer = new StringRedisSerializer();

        template.setKeySerializer(stringSerializer);// key序列化
        template.setValueSerializer(jackson2JsonRedisSerializer);// value序列化
        template.setHashKeySerializer(stringSerializer);// Hash key序列化
        template.setHashValueSerializer(jackson2JsonRedisSerializer);// Hash value序列化

        template.afterPropertiesSet();

        return template;

    }

//    /**
//     * RedisTemplate配置
//     *
//     * @param factory
//     * @return
//     */
//    @Bean
//    public RedisTemplate<String, String> redisTemplate(LettuceConnectionFactory factory ) {
//        StringRedisTemplate template = new StringRedisTemplate(factory);
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        template.setValueSerializer(jackson2JsonRedisSerializer);
//        template.afterPropertiesSet();
//        return template;
//    }
//
//    /**
//     * redis连接工厂
//     * @return
//     */
//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("47.92.75.224", 6379);
//        config.setDatabase(8);
//        RedisPassword pass = RedisPassword.of("gjxx1q2w3e");
//        config.setPassword(pass);
//        return new LettuceConnectionFactory(config);
//    }

//    /**
//     * redis响应式连接工厂
//     * @return
//     */
//    @Bean
//    public ReactiveRedisConnectionFactory connectionFactory() {
//      return new LettuceConnectionFactory("localhost", 6379);
//    }


//    /**
//     * Lettuce
//     * 高可用redis连接工厂（容灾）
//     */
//    @Bean
//    public RedisConnectionFactory lettuceConnectionFactory() {
//      RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
//      .master("mymaster")
//      .sentinel("127.0.0.1", 26379)
//      .sentinel("127.0.0.1", 26380);
//      return new LettuceConnectionFactory(sentinelConfig);
//    }

}
