public class College {
  String name;
  int phone;
  String location;


  public College(String name, int phone, String location) {
    this.name = name;
    this.phone = phone;
    this.location = location;
  }

  public void displayCollegeInfo(){
    System.out.println("college name : "+this.name+"\nCollege Phone : "+this.phone+"\nCollege Location : "+this.location);
  }

  
}
