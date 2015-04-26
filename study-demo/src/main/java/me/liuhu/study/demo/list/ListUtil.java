package me.liuhu.study.demo.list;

import java.util.List;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.study.demo.list       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/4/23                  <br>
 */
public class ListUtil {
    public static boolean isDuplicateData (List<?> list){
        for (int i = 0; i < list.size() - 1; i++) {//循环遍历集体中的元素
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}