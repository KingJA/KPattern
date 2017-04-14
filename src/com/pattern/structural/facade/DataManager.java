package com.pattern.structural.facade;

import com.pattern.structural.facade.util.IDb;
import com.pattern.structural.facade.util.IEncode;
import com.pattern.structural.facade.util.IHttp;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/14
 * [email]    :     kingjavip@gmail.com
 */
public class DataManager {
    private IDb iDb;
    private IHttp iHttp;
    private IEncode iEncode;

    public DataManager(Builder builder) {
        this.iDb = builder.iDb;
        this.iHttp = builder.iHttp;
        this.iEncode = builder.iEncode;

    }

    public void loadData(String url) {
        String data = iHttp.getData(url);
        String encode = iEncode.encode(data);
        iDb.saveData(encode);
    }


    static class Builder {
        private IDb iDb;
        private IHttp iHttp;
        private IEncode iEncode;

        public Builder setDb(IDb iDb) {
            this.iDb = iDb;
            return this;
        }

        public Builder setHttp(IHttp iHttp) {
            this.iHttp = iHttp;
            return this;
        }

        public Builder setEncode(IEncode iEncode) {
            this.iEncode = iEncode;
            return this;
        }

        public DataManager build() {
            return new DataManager(this);
        }

    }
}
