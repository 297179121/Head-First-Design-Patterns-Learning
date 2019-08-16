package study.coffee.lastest;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if( customerWantsCondiments() ){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /**
     * 这就是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做
     * @return
     */
    boolean customerWantsCondiments(){
        return true;
    }

}
