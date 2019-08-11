package study.beverage;

/**
 * 装饰者模式
 */
public abstract class Beverage {

    public String getDescription() {
        return description;
    }

    String description = "Unknown Beverage";

    public abstract double cost();



}
