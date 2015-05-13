package me.liuhu;

import me.liuhu.domain.trade.TradeBO;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.jms.*;
import com.alibaba.fastjson.JSON;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  PACKAGE_NAME       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/5/12                  <br>
 */
@Component("messageConsumer")
public class MessageConsumer implements MessageListener {
    @Override
    public void onMessage(Message message)  {
        Object msg = null;
        try {
            if (message instanceof TextMessage) {
                TextMessage txtMsg = (TextMessage) message;
                msg = txtMsg.getText();
                System.out.println(Thread.currentThread().getName() +  "接受到消息: " + ((TextMessage) message).getText());
            }else if(message instanceof ObjectMessage){
                ObjectMessage objMsg = (ObjectMessage) message;
                msg = objMsg.getObject();
                System.out.println(Thread.currentThread().getName() +  "接受到消息: " + ((ObjectMessage) message).getObject());
            }else{
                msg = message;
                System.out.println(Thread.currentThread().getName() + "不能识别此消息:" + message);
            }
        } catch (JMSException e) {
            msg = null;
            e.printStackTrace();
        }
        this.dealMessage(msg);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application_mq.xml"});
    }

    private void dealMessage(Object message){
        TradeBO tradeBO =  JSON.parseObject((String) message, TradeBO.class);
        System.out.println(tradeBO.getChildTradeBo().getChildTradeNo());
        System.out.println(tradeBO.getChildTradeBo().getDate());
        System.out.println(tradeBO.getTradeNo());
    }
}