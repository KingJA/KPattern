package com.pattern.structural.composite.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/9
 * [email]    :     kingjavip@gmail.com
 */
public interface Component {
    void operation();
    void add(Component child);
    void remove(Component child);
    Component getChild(int index);
}
