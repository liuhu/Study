package me.liuhu;

import me.liuhu.bo.CompareBO;
import me.liuhu.provider.CompareProvider;

import java.math.BigDecimal;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/27                  <br>
 */
public class CompareProviderImpl implements CompareProvider {
    @Override
    public boolean compareBigDecimal (BigDecimal a, BigDecimal b) {
        if (a.compareTo(b) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean compareBeans(CompareBO compareBO) {
        if(compareBO.getA().compareTo(compareBO.getB()) == 0){
            return true;
        }else {
            return false;
        }
    }
}