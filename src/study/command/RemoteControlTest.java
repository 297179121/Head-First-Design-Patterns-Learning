package study.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        // 调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 电灯对象，此对象是请求的接收者
        Light light = new Light();
        // 创建一个命令，然后将接收者传给它
        LightOnCommand lightOn = new LightOnCommand(light);

        // 把命令传给调用者
        remote.setCommand(lightOn);
        // 模拟按下按钮
        remote.buttonWasPressed();
    }

}
