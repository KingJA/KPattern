package com.pattern.structural.composite.uml;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/9
 * [email]    :     kingjavip@gmail.com
 */
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }

    @Override
    public void add(Component child) {
        throw new UnsupportedOperationException("Leaf doesn't have this add method");
    }

    @Override
    public void remove(Component child) {
        throw new UnsupportedOperationException("Leaf doesn't have this remove method");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Leaf doesn't have this getChild method");
    }
}
