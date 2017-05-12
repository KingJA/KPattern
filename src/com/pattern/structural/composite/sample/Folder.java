package com.pattern.structural.composite.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/9
 * [email]    :     kingjavip@gmail.com
 */
public class Folder extends Dir {
    private List<Dir> dirs = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void removeDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void printDir() {
        System.out.println("文件夹名称："+getName());
        for (Dir dir : dirs) {
            dir.printDir();
        }
    }
}
