public class MainClass {
  public static void main(String[] args) {
    University uni1 = new University("Goa University", 738723288);
    College coll1 = new College("Goa Uni",73789333,"Goa Business School", 686466763, "Taleigao");
    Departments dept1 = new Departments("Goa University", 8945673, "College of Science", 452455685, "Goa", "Dept of Biotech", "Mr.Rahul",58932659);

    uni1.displayUniInfo();
    coll1.displayCollegeInfo();
    dept1.displayDeptInfo();

    dept1.detailsSwitch();
  }
}
