package com.lym.design.pattern.structural.adapter.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName ChinesToJepanLanguTranslator.java
 * @Description 不能修改这个类, 适配者
 * @createTime 2022-01-15 16:58
 */
public class ZhTOJPTranslator implements Translate {

    @Override
    public String translate(String content) {
        if ("稍等".equals(content)) {
            return "乔登妈的";
        } else if ("不要".equals(content)) {
            return "雅蔑蝶";
        }
        return null;
    }
}
