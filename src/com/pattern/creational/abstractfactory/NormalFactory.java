package com.pattern.creational.abstractfactory;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class NormalFactory implements ViewFactory {
    @Override
    public Button createButton() {
        return new NormalButton();
    }

    @Override
    public EditText createEditText() {
        return new NormalEditText();
    }
}
