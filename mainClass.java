public class mainClass {
  public static void main(String[] args) {
    Uni uniObj = new Uni("Goa Uni", 1111);
    uniObj.displayDetails();
    
    System.out.println();
    
    College colObj = new College("GBS", 42154335, "Taleigao");
    colObj.displayCollegeInfo();
  }
}
