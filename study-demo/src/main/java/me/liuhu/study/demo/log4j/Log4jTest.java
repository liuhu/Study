package me.liuhu.study.demo.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.study.demo.log4j       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/15                  <br>
 */
public class Log4jTest {

    private static final Logger logger = LoggerFactory.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        TestBO testBo1 = new TestBO();
        logger.error("testBo1 = {}",testBo1.getOutTradeNo());

        //打印日志也要验证参数哦~~
        TestBO testBo2 = null;
        logger.error("testBo2 = {}",testBo2.getOutTradeNo());  // 空指针异常
    }
}