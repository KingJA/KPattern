package com.pattern.structural.composite.sample;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/9
 * [email]    :     kingjavip@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Folder cFolder = new Folder("C盘");
        Folder windowFolder = new Folder("C:\\Windows");
        cFolder.addDir(new File("笔记本.txt"));
        cFolder.addDir(new File("画图.txt"));
        cFolder.addDir(new File("计算器.exe"));
        windowFolder.addDir(new File("a.txt"));
        windowFolder.addDir(new File("b.txt"));
        cFolder.addDir(windowFolder);
        cFolder.printDir();
    }
}
