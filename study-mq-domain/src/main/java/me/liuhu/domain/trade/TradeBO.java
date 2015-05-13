package me.liuhu.domain.trade;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.domain.trade       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/5/12                  <br>
 */
public class TradeBO {

    private String tradeNo;

    private ChildTradeBo childTradeBo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public ChildTradeBo getChildTradeBo() {
        return childTradeBo;
    }

    public void setChildTradeBo(ChildTradeBo childTradeBo) {
        this.childTradeBo = childTradeBo;
    }
}