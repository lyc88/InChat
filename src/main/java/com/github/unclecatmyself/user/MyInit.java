package com.github.unclecatmyself.user;

import com.github.unclecatmyself.common.bean.InitNetty;

/**
 * Created by MySelf on 2019/1/3.
 */
public class MyInit extends InitNetty {

    @Override
    public int getWebport() {
        return 8090;
    }

    @Override
    public Boolean getDistributed() {
        return true;
    }

    @Override
    public boolean isSsl() {
        return true;
    }

}
