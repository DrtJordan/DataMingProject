package com.morty.java.dmp.elasticsearch.aggs;

/**
 * Created by xiangmin on 2016/4/7.
 *
 * �����Nested�ۺ���ES������˵��Nested Aggregate�����NewYZSearch���Nested Aggregate�Ƕ��ۺϣ�
 */
public class NestedAgg extends EsAggsEntity {
    public NestedAgg(String aggName, int aggSize) {
        setAggName(aggName);
        setAggSize(aggSize);
        setAggType(EsAggsEntity.NESTED_TYPE);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
