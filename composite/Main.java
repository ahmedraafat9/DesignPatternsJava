package composite;

public class Main {

    public static void main(String[] args) {
        Employee developer1 = new Developer("john");
        Employee developer2 = new Developer("jane");

        Manager manager1 = new Manager("ahmed");
        manager1.addOrdinates(developer1);
        manager1.addOrdinates(developer2);

        //----------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------

        Employee developer3 = new Developer("moftah");
        Employee developer4 = new Developer("nuha");

        Manager manager2 = new Manager("ramy");
        manager2.addOrdinates(developer3);
        manager2.addOrdinates(developer4);


        
        Manager topManager = new Manager("CEO");
        topManager.addOrdinates(manager1);
        topManager.addOrdinates(manager2);
        
        topManager.showDetails();
    }
}