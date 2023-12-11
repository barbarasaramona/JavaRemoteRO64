package designPatterns.behavioral.state;

public class TVStopState implements State{
    @Override
    public void doAction() {
        System.out.println("TV turn off");
    }
}
