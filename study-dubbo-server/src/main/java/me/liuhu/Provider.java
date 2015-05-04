package me.liuhu;

import java.math.BigDecimal;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/27                  <br>
 */
public interface Provider {

    /**
     * 比较大小
     * @param a
     * @param b
     * @return
     */
    public boolean compareBigDecimal(BigDecimal a, BigDecimal b);
}