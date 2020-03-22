package com.pattern.structural.facade.utilimp;

import com.pattern.structural.facade.util.IEncode;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/14
 * [email]    :     kingjavip@gmail.com
 */
public class CommonEncode implements IEncode {
    @Override
    public String encode(String data) {
        String result=">>>加密数据:("+data+")";
        return result;
    }
}
