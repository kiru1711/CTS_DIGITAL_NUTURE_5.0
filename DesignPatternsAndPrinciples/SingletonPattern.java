package DesignPatternsAndPrinciples;
public class SingletonPattern {
   private static SingletonPattern instance;
   
   public static SingletonPattern getInstance() {
      if (instance == null) {
         instance = new SingletonPattern();
      }
      return instance;
   }
   public void showMessage() {
      System.out.println("Hello instance created!");
   }
   public static void main(String[] args) {
      SingletonPattern obj1 = SingletonPattern.getInstance();
      SingletonPattern obj2 = SingletonPattern.getInstance();
      obj1.showMessage();
        if (obj1 == obj2) {
             System.out.println("Both objects are the same instance.");
        } else {
             System.out.println("Objects are different instances.");
        }
   }
}
/* OUTPUT:
Hello instance created!
Both objects are the same instance.
*/