package me.liuhu.study.demo.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.study.demo.list       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/23                  <br>
 */
public class TestList {
    public static void main(String[] args) {
        List<String> outTradeNos =  new ArrayList<String>();
        outTradeNos.add("a");
        outTradeNos.add("c");
        outTradeNos.add("d");
        outTradeNos.add("e");
        outTradeNos.add("t");
        outTradeNos.add("a");
        if(ListUtil.isDuplicateData(outTradeNos)){
            System.out.print("1");
        }
    }
}