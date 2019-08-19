package study.gumball;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if( count>0 ){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if( state==HAS_QUARTER ){
            System.out.println("You cannot insert another quarter");
        }else if( state==NO_QUARTER ){
            System.out.println("You inserted a quarter");
        }else if( state==SOLD_OUT ){
            System.out.println("You cannot insert a quarter, the machine is sold out");
        }else if( state==SOLD ){
            System.out.println("Please wait, we are already giving you a gumball");
        }
    }

    public void ejectQuarter(){
        if( state==HAS_QUARTER ){
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        }else if( state==NO_QUARTER ){
            System.out.println("You have not inserted a quarter");
        }else if( state==SOLD ){
            System.out.println("Sorry, you already turned the crank");
        }else if( state==SOLD_OUT ){
            System.out.println("You cannot eject, you have not inserted a quarter yet");
        }
    }

    public void turnedCrank(){
        if( state==SOLD ){
            System.out.println("Turning twice doesnot get you another gumball");
        }else if( state==NO_QUARTER ){
            System.out.println("You turned but there is no quarter");
        }else if( state==SOLD_OUT ){
            System.out.println("You turned, but there are no gumballs");
        }else if( state==HAS_QUARTER ){
            System.out.println("You turned...");
            state = SOLD;
        }
    }

    public void dispense(){
        if( state==SOLD ){
            System.out.println("A gumball comes rolling out the slot");
            count = count-1;
            if( count==0 ){
                System.out.println("Oops, out of gumballs");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
        }else if( state==NO_QUARTER ){
            System.out.println("You need to pay first");
        }else if( state==SOLD_OUT ){
            System.out.println("No gumball dispensed");
        }else if( state==HAS_QUARTER ){
            System.out.println("No gumball dispensed");
        }
    }

}
