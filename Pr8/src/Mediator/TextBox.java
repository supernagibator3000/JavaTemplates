package Mediator;

public class TextBox implements Component{
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
