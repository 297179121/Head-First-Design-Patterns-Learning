package study.factory;

/**
 * 定义简单工厂
 * 简单工厂其实不是一个设计模式，反而比较像一种编程习惯。
 */
public class SimplePizzaFactory {

    public Pizza createPizza( String type ){
        Pizza pizza = null;
        if( type.equals("cheese") ){
            pizza = new CheesePizza();
        }else if( type.equals("pepperoni") ){
            pizza = new PepperoniPizza();
        }else if( type.equals("clam") ){
            pizza = new ClamPizza();
        }else if( type.equals("veggie") ){
            pizza = new VeggiePizza();
        }

        return pizza;
    }

}
