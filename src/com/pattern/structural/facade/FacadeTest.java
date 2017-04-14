package com.pattern.structural.facade;

import com.pattern.structural.facade.utilimp.CommonDb;
import com.pattern.structural.facade.utilimp.CommonEncode;
import com.pattern.structural.facade.utilimp.CommonIHttp;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/14
 * [email]    :     kingjavip@gmail.com
 */
public class FacadeTest {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager.Builder()
                .setDb(new CommonDb())
                .setEncode(new CommonEncode())
                .setHttp(new CommonIHttp())
                .build();
        dataManager.loadData("http://www");
    }
}
