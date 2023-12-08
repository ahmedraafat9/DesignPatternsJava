package adaptor;

public class Main {
    public static void main(String[] args) {
        OldSystem oldSystem =new OldSystem();
        NewInterface adapter = new Adapter(oldSystem);

        adapter.doNewTask();
    }
}
