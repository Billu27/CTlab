public class Uni {
  String name;
  int uniCode;

  public Uni(String name, int uniCode) {
    this.name = name;
    this.uniCode = uniCode;
  }

  public void displayDetails(){
    System.out.println("\nname : "+this.name+"\ncode : "+this.uniCode);
  }

  // public static void main(String[] args) {
  //   Uni obj = new Uni("Goa University", 12332);
  //   obj.displayDetails();
  // }

}
