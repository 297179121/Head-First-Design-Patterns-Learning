package study.duck.d;

import study.duck.d.myinterface.FlyBehavior;
import study.duck.d.myinterface.QuackBehavior;

/**
 * 将fly()和quack()分别提取到FlyBehavior和QuackBehavior接口中，根据需求再分别创建两个接口的实现类
 * setFlyBehavior、setQuackBehavior的妙用参见MallardDuck类
 */
abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    /**
     *  会水
     */
    protected void swim(){

    }

    /**
     * 外观
     */
    protected void display(){

    }

    void performQuack(){
        quackBehavior.quack();
    }

    void performFly(){
        flyBehavior.fly();
    }

}
