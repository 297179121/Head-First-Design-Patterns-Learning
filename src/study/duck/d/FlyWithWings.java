package study.duck.d;

import study.duck.d.myinterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyWithWings.fly=========");
    }
}
