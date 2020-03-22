package com.pattern.structural.facade.utilimp;

import com.pattern.structural.facade.util.IDb;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/14
 * [email]    :     kingjavip@gmail.com
 */
public class CommonDb implements IDb {
    @Override
    public void saveData(String data) {
        System.out.println(">>>保存数据到本地:(" + data + ")");
    }
}
