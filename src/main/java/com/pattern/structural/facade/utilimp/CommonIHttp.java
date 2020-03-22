package com.pattern.structural.facade.utilimp;

import com.pattern.structural.facade.util.IHttp;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/14
 * [email]    :     kingjavip@gmail.com
 */
public class CommonIHttp implements IHttp {
    @Override
    public String getData(String url) {
        String result=">>>从网址"+url+"获取的数据";
        return result;
    }
}
