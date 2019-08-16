package study.coffee.lastest;

public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {

    }

    @Override
    void addCondiments() {

    }

    /**
     * 覆盖这个钩子，提供自己的方法
     * @return
     */
    @Override
    boolean customerWantsCondiments() {
        return false;
    }
}
