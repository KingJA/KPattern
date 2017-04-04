package com.pattern.creational.abstractfactory;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class MaterialFactory implements ViewFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public EditText createEditText() {
        return new MaterialEditText();
    }
}
