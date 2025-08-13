
public class University {
  String name;
  int phone;

  public University(String name, int phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public int getPhone() {
    return phone;
  }

 public void displayUniInfo(){
  System.out.println("\nUniname : "+this.name+"\nuni phone : "+this.phone);
 }


}
