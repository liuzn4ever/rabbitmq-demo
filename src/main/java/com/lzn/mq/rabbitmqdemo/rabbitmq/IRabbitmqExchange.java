package com.lzn.mq.rabbitmqdemo.rabbitmq;

import java.util.Map;

public interface IRabbitmqExchange {

    /**
     * Exchange(交换机) 的名称
     * */
    String exchangeName();

    /**
     * exchange类型 DIRECT("direct"), FANOUT("fanout"), TOPIC("topic"), HEADERS("headers")
     * */
    String type();

    /**
     * 是否持久化
     */
    boolean durable();

    /**
     * 当所有队列在完成使用此exchange时，是否删除
     */
    boolean autoDelete();

    /**
     * 是否允许直接binding
     * 如果是true的话 则不允许直接binding到此 exchange
     */
    boolean internal();

    /**
     * 其他的一些参数设置
     */
    Map<String, Object> arguments();

    /**
     * 延时 Exchange
     * */
    String delayExchangeName();

}
