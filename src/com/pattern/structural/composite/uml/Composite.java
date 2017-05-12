package com.pattern.structural.composite.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/5/9
 * [email]    :     kingjavip@gmail.com
 */
public class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }

    @Override
    public void add(Component child) {
        components.add(child);
    }

    @Override
    public void remove(Component child) {
        components.remove(child);
    }

    @Override
    public Component getChild(int index) {
        if (components.size() > index) {
            return components.get(index);
        }
        return null;
    }
}
