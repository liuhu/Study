package me.liuhu;

import me.liuhu.domain.trade.ChildTradeBo;
import me.liuhu.domain.trade.TradeBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import com.alibaba.fastjson.JSON;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/5/12                  <br>
 */
@Component
public class MessageSender {
    @Autowired
    @Qualifier("producerJmsTemplate")
    private JmsTemplate jmsTemplate;

    @Autowired
    @Qualifier("testTopic")
    private Destination destination;

    /**
     * 发送消息
     * @param message 消息对象
     */
    public void send(final Serializable message) {
        try{
            jmsTemplate.convertAndSend(destination, message);
        }catch(JmsException e){
            e.getMessage();
        }
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application_mq.xml"});
        MessageSender sender = context.getBean(MessageSender.class);
        sender.send("Hello broker!");

        for (int i = 0; i < 999; i++){
            ChildTradeBo childTradeBo = new ChildTradeBo();
            childTradeBo.setChildTradeNo("C001" + i);
            childTradeBo.setDate(Calendar.getInstance().getTime());
            TradeBO tradeBO = new TradeBO();
            tradeBO.setChildTradeBo(childTradeBo);
            tradeBO.setTradeNo("T001" + i);

            sender.send(JSON.toJSONString(tradeBO));
        }



    }


}
