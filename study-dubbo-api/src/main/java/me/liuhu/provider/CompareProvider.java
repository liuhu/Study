package me.liuhu.provider;

import me.liuhu.bo.CompareBO;

import java.math.BigDecimal;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.provider       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/5/4                  <br>
 */
public interface CompareProvider {
    /**
     * 比较大小
     * @param a
     * @param b
     * @return
     */
    public boolean compareBigDecimal(BigDecimal a, BigDecimal b);

    /**
     * 比较 compareBO中值的大小
     * @param compareBO
     * @return
     */
    public boolean compareBeans(CompareBO compareBO);
}