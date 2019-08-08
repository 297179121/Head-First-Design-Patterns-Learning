package study.duck.d;

import study.duck.d.myinterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyNoWay.fly=========");
    }
}
