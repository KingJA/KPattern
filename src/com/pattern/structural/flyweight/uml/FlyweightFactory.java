package com.pattern.structural.flyweight.uml;

import java.util.HashMap;
import java.util.Map;

/**
 * Description：TODO
 * Create Time：2017/5/12 14:03
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight getFlyweight(String extrinsicState) {
        if (flyweightMap.containsKey(extrinsicState)) {
            return flyweightMap.get(extrinsicState);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(extrinsicState);
            flyweightMap.put(extrinsicState, flyweight);
            return flyweight;
        }
    }

    public int getFlyweightSize() {
        return flyweightMap.size();
    }

}
