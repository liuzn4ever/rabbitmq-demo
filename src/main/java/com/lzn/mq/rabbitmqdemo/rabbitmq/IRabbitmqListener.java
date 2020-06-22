package com.lzn.mq.rabbitmqdemo.rabbitmq;

/**
 * 消息监听(消费)者
 * */
public interface IRabbitmqListener {

    /**
     * 处理rabbitMq的消息
     * */
    boolean handleMessage(Object obj);

}
