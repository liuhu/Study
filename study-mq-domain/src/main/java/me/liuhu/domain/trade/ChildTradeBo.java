package me.liuhu.domain.trade;

import java.util.Date;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.domain.trade       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/5/12                  <br>
 */
public class ChildTradeBo {

    private String childTradeNo;

    private Date date;

    public String getChildTradeNo() {
        return childTradeNo;
    }

    public void setChildTradeNo(String childTradeNo) {
        this.childTradeNo = childTradeNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}