package study.duck.b;

/**
 * 一开始要求鸭子有飞行行为，于是加了一个fly()方法。
 * 但是对于一些不要求fly()行为的子类只能将fly()重写，否则fly()默认为Duck中的函数体。参见RubberDuck
 *
 */
class Duck {

    /**
     *  嘎嘎叫
     */
    protected void quack(){

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

    /**
     *  会飞
     */
    protected void fly(){

    }

}
