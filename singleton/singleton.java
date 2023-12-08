package singleton;
/**
 * singleton
 */
public class singleton {
    private static singleton object;
    private singleton(){}

    public static synchronized singleton getInstance(){
        if (object == null)
            object = new singleton();
        return object;
    }
    

    public static void main(String[] args) {
      singleton ahmed1 = singleton.getInstance();
      System.out.println(ahmed1);

      singleton ahmed2 = singleton.getInstance();
      System.out.println(ahmed2);
    }

}