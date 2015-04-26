package me.liuhu.study.demo.bigdecimal;

import java.math.BigDecimal;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.study.demo.bigdecimal       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/18                  <br>
 */
public class TestBigDecimal {


    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0.000001);
        BigDecimal b = new BigDecimal(0.0000010000000000000002345344563456345645645654535);
        OperateBigDecimal compareBigDecimal = new OperateBigDecimal();
        if (compareBigDecimal.compareBigDecimal(a, b)){
            System.out.println("两值相等");
        }else {
            System.out.println("不等");
        }
    }


}