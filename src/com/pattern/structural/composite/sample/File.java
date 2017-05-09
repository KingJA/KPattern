package com.pattern.structural.composite.sample;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/9
 * [email]    :     kingjavip@gmail.com
 */
public class File extends Dir {
    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件不支持添加功能");
    }

    @Override
    public void removeDir(Dir dir) {
        throw new UnsupportedOperationException("文件不支持删除功能");
    }

    @Override
    public void printDir() {
        System.out.println("文件名称：" + getName());
    }
}
