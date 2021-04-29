package Mediator;

public class CheckBox implements  Component{
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "CheckBox";
    }
}
