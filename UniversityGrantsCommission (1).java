class University {
    String name;
    String type;
    String state;

    public University(String name, String type, String state) {
        this.name = name;
        this.type = type;
        this.state = state;
    }

    public void displayUniversityInfo() {
        System.out.println("University Name: " + name);
        System.out.println("University Type: " + type);
        System.out.println("University State: " + state);
    }
}

class College {
    String collegeName;
    String collegeType;
    String collegeState;
    University university;

    public College(String collegeName, String collegeType, String collegeState, University university) {
        this.collegeName = collegeName;
        this.collegeType = collegeType;
        this.collegeState = collegeState;
        this.university = university;
    }

    public void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Type: " + collegeType);
        System.out.println("College State: " + collegeState);
        System.out.println("Associated with University: " + university.name);
    }
}

class Administration {
    String administrationName;
    String administrationPost;
    String administrationState;
    int administrationPhonenumber;

    public Administration(String administrationName, String administrationPost, String administrationState, int administrationPhonenumber) {
        this.administrationName = administrationName;
        this.administrationPost = administrationPost;
        this.administrationState = administrationState;
        this.administrationPhonenumber = administrationPhonenumber;
    }

    public void displayAdministrationInfo() {
        System.out.println("Administration Name: " + administrationName);
        System.out.println("Administration Post: " + administrationPost);
        System.out.println("Administration State: " + administrationState);
        System.out.println("Administration Phonenumber: " + administrationPhonenumber);
    }
}

public class UniversityGrantsCommission {
    public static void main(String[] args) {

        University u1 = new University("Goa University", "State", "Goa");
        College c1 = new College("Chowgule College", "Autonomous", "Goa", u1);
        Administration a1 = new Administration("Chandrakant", "Chairman", "Delhi", 1231);

        u1.displayUniversityInfo();  
        c1.displayCollegeInfo(); 
        System.out.println();
        a1.displayAdministrationInfo();
    }
}
