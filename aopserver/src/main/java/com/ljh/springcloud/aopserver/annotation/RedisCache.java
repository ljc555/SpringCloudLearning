package com.ljh.springcloud.aopserver.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述：加入查询结果的缓存
 *
 * @author chhliu 创建时间：2017年2月14日 下午10:30:00
 * @version 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface RedisCache {

    Class<?> type();//被代理类的全类名，在之后会做为redis hash 的key
}