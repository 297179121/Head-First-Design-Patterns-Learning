package study.duck.c;

/**
 * 将fly()和quack()用接口替代，子类通过实现接口实现这两个功能。
 * 但每新增一个需要fly()或quack()的子类都需要实现这些接口。
 * 子类数量很多的话实现这些接口会很耗时，此种方式造成代码不能复用。
 *
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
