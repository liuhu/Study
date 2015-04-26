package me.liuhu.study.demo.log4j;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.study.demo.log4j       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/15                  <br>
 */
public class TestBO {

    /**
     * 外部充值订单号，可为空
     */
    private String outChargeNo;

    /**
     * 外部支付订单号，仅作为通知使用
     */
    private String outTradeNo;

    public String getOutChargeNo() {
        return outChargeNo;
    }

    public void setOutChargeNo(String outChargeNo) {
        this.outChargeNo = outChargeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
}