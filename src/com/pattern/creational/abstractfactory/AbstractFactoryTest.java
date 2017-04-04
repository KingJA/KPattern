package com.pattern.creational.abstractfactory;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/4
 * [email]    :     kingjavip@gmail.com
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        try {
            ViewFactory viewFactory = (ViewFactory) Class.forName(AbstractFactoryConfig.ViewFactoryName).newInstance();
            viewFactory.createButton().display();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
