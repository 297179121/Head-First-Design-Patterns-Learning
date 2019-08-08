package study.duck.c;

/**
 * 将fly()和quack()用接口替代，子类通过实现接口实现这两个功能。
 * 但每新增一个需要fly()或quack()的子类都需要实现这些接口。
 * 子类数量很多的话实现这些接口会很耗时，此种方式造成代码不能复用。
 *
 * Java接口不具有实现代码，所以继承接口无法达到代码的复用。
 * 这意味着：无论何时你需要修改某个行为，你必须得往下追踪并在每一个
 * 定义此行为的类中修改它，一不小心可能会造成新的错误！
 */
class Duck {



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
