package com.lzn.mq.rabbitmqdemo.rabbitmq;

public interface IRabbitMqService {

    /**
     * 给Rabbitmq发送消息
     * */
    void send(IRabbitmqExchange exchange,IRabbitmqRouting routing,Object msg);

    /**
     * 给Rabbitmq发送延迟消息
     * */
    void send(IRabbitmqExchange exchange,IRabbitmqRouting routing,Object msg,long delay);

}
