import java.util.Scanner;

public class Departments extends College{
  String deptName;
  String deptDirector;
  int deptPhone;

  public String getDeptDirector() {
    return deptDirector;
  }

  public String getDeptName() {
    return deptName;
  }

  public int getDeptPhone() {
    return deptPhone;
  }
  

  public Departments(String name, int phone, String collegeName, int collegePhone, String collegeLocation,
      String deptName, String deptDirector, int deptPhone) {
    super(name, phone, collegeName, collegePhone, collegeLocation);
    this.deptName = deptName;
    this.deptDirector = deptDirector;
    this.deptPhone = deptPhone;
  }


  public void displayDeptInfo(){
    super.displayCollegeInfo();
    System.out.println("\nDepartment name : "+this.deptName+"\nDepartment Phone : "+this.deptPhone+"\nDirector : "+this.deptDirector);
  }

  public void detailsSwitch(){
    Scanner sc = new Scanner(System.in);
    int option;

    System.out.println("\n1 : Uni Name\n2 : Uni Phone\n3 : College Name\n4 : College Phone\n5 : College Location\n6 : Dept Name\n7 : Dept DIrector\n8 : Dept Phone\nEnter option here : ");
    option = sc.nextInt();
    sc.close();
    switch(option){
      case 1 : System.out.println("University Name : "+this.getName());
              break;
      case 2: System.out.println("University Phone : "+this.getPhone());
              break;
      case 3 : System.out.println("College Name : "+this.getCollegeName());
              break;
      case 4 : System.out.println("College phone : "+this.getCollegePhone());
              break;
      case 5 : System.out.println("College Location : "+this.getCollegeLocation());
              break; 
      case 6 : System.out.println("Department name : "+this.getDeptName());
              break;
      case 7 : System.out.println("Department Direector : "+this.getDeptDirector());
              break;
      case 8 : System.out.println("Department phone : "+this.getDeptPhone());
              break;
      default : System.out.println("Please enter a valid input");
              break;

    }
  }

  
}

