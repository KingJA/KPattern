package com.pattern.structural.composite.sample;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/9
 * [email]    :     kingjavip@gmail.com
 */
public abstract class Dir {
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void addDir(Dir dir);

    public abstract void removeDir(Dir dir);

    public abstract void printDir();
}
