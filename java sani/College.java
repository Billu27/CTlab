public class College extends University {
  String collegeName;
  int collegePhone;
  String collegeLocation;

  public String getCollegeLocation() {
    return collegeLocation;
  }

  public int getCollegePhone() {
    return collegePhone;
  }

 public String getCollegeName() {
   return collegeName;
 }

  public College(String name, int phone, String collegeName, int collegePhone, String collegeLocation) {
    super(name, phone);
    this.collegeName = collegeName;
    this.collegePhone = collegePhone;
    this.collegeLocation = collegeLocation;
  }

  public void displayCollegeInfo(){
    super.displayUniInfo();
    System.out.println("\nCollege name : "+this.collegeName+"\nCollege Phone : "+this.collegePhone+"\nCollege Location : "+this.collegeLocation);
  }
}
