package adaptor;

public class Adapter implements NewInterface{
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem){
        this.oldSystem=oldSystem;
    }

    @Override
    public void doNewTask() {
        oldSystem.doOldTask();
    }

}
