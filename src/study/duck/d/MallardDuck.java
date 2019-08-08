package study.duck.d;

/**
 * 有多个实现了FlyBehavior接口和QuackBehavior接口的类，在MallardDuck的构造函数中可以根据需要选择这些类实例化赋值给quackBehavior、flyBehavior
 */
class MallardDuck extends Duck{

    public MallardDuck(){
        // 多用组合，少用继承
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }

}
