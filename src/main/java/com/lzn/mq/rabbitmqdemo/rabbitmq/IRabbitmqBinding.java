package com.lzn.mq.rabbitmqdemo.rabbitmq;

public interface IRabbitmqBinding {

    /**
     * 需要绑定的exchange(交换机)
     * */
    IRabbitmqExchange exchange();

    /**
     * 需要绑定的routing(路由)
     * */
    IRabbitmqRouting routing();

    /**
     * 需要绑定的queue(队列)
     * */
    IRabbitmqQueue queue();

    /**
     * 消息队列是否允许延时
     * */
    boolean allowDelay();
}
