package study.beverage;

public class MainStarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        // 以深焙咖啡为对象
        Beverage beverage2 = new DarkRoast();
        // 以摩卡对象装饰它
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        // 以奶泡对象装饰它
        beverage2 = new Whip(beverage2);
        // 调用cost()方法，并依赖委托（delegate）将调料的价钱加上去
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

    }
}
