package com.pattern.creational.prototype;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/3/18
 * [email]    :     kingjavip@gmail.com
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ShallowClone();


        DeepClone();


    }

    private static void DeepClone() {
        DeepRobot deepRobot1 = new DeepRobot("终结者");
        deepRobot1.setBattery(new Battery());
        DeepRobot deepRobot2 = null;
        try {
            deepRobot2 = deepRobot1.deepClone();
        } catch (Exception e) {
            System.out.println("克隆失败");
        }
        DeepRobot deepRobot3 = deepRobot1;
        System.out.println("DeepRobot原型: " + deepRobot1.getName().hashCode());
        System.out.println("DeepRobot克隆: " + deepRobot2.getName().hashCode());
        System.out.println("DeepRobot赋值: " + deepRobot3.getName().hashCode());
        System.out.println("DeepRobot比较 name: " + (deepRobot1.getName() == deepRobot2.getName()));
        System.out.println("DeepRobot比较 Battery: " + (deepRobot1.getBattery() == deepRobot2.getBattery()));
        System.out.println("DeepRobot比较 DeepRobot: " + (deepRobot1 == deepRobot2));
        deepRobot1.setName("金刚狼");
        System.out.println("终结者=>金刚狼");
        System.out.println("DeepRobot原型: " + deepRobot1.getName());
        System.out.println("DeepRobot克隆: " + deepRobot2.getName());
        System.out.println("DeepRobot赋值: " + deepRobot3.getName());
    }

    private static void ShallowClone() {
        ShallowRobot shallowRobot1 = new ShallowRobot("终结者");
        shallowRobot1.setBattery(new Battery());
        ShallowRobot shallowRobot2 = shallowRobot1.clone();
        ShallowRobot shallowRobot3 = shallowRobot1;
        System.out.println("ShallowRobot原型: " + shallowRobot1.getName().hashCode());
        System.out.println("ShallowRobot克隆: " + shallowRobot2.getName().hashCode());
        System.out.println("ShallowRobot赋值: " + shallowRobot3.getName().hashCode());
        System.out.println("ShallowRobot比较 name: " + (shallowRobot1.getName() == shallowRobot2.getName()));
        System.out.println("ShallowRobot比较 Battery: " + (shallowRobot1.getBattery() == shallowRobot2.getBattery()));
        System.out.println("ShallowRobot比较 ShallowRobot: " + (shallowRobot1 == shallowRobot2));
        shallowRobot1.setName("金刚狼");
        System.out.println("终结者=>金刚狼");
        System.out.println("ShallowRobot原型: " + shallowRobot1.getName());
        System.out.println("ShallowRobot克隆: " + shallowRobot2.getName());
        System.out.println("ShallowRobot赋值: " + shallowRobot3.getName());
    }
}
