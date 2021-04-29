package Mediator;

public class mediatorClass implements Mediator{
    private TextBox textBox;
    private OkButton okButton;
    private CheckBox checkBox;

    @Override
    public void addComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()){
            case "TextBox":
                textBox = (TextBox)component;
                break;
            case "OkButton":
                okButton = (OkButton)component;
                break;
            case "CheckBox":
                checkBox = (CheckBox)component;
                break;
        }
    }

    @Override
    public void action() {
        
    }
}
