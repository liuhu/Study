package me.liuhu.study.demo.bigdecimal;

import java.math.BigDecimal;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.study.demo.bigdecimal       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/18                  <br>
 */
public class OperateBigDecimal {

    /**
     * 比较两个BigDecimal的值是否相等
     * @param a
     * @param b
     * @return
     */
    public boolean compareBigDecimal (BigDecimal a, BigDecimal b) {
        if (a.compareTo(b) == 0) {
            return true;
        }
        return false;
    }
}