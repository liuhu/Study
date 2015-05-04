package me.liuhu;

import me.liuhu.bo.CompareBO;
import me.liuhu.provider.CompareProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/27                  <br>
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});
        CompareProvider compareProvider = context.getBean(CompareProvider.class);
        BigDecimal a = new BigDecimal(0.001);
        BigDecimal b = new BigDecimal(0.001);
        if (compareProvider.compareBigDecimal(a, b)){
            System.out.println("两值相等");
        }else {
            System.out.println("不等");
        }
        CompareBO compareBO = new CompareBO();
        compareBO.setA(a);
        compareBO.setB(b);
        if (compareProvider.compareBeans(compareBO)){
            System.out.println("两值相等");
        }else{
            System.out.println("不等");
        }
    }
}