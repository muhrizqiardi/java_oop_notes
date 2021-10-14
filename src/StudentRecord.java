public class StudentRecord {
    public String name;
    public char sex;
    public String address;
    public String major;
    private double programmingGrade;
    private double linearAlgebraGrade;
    private double dataStructuresGrade;
    private double databaseGrade;
    private double networkingGrade;
    private static int totalStudent = 0; // Static variable is a variable that belongs to a class itself, not by each object

    // Constructor
    StudentRecord(String name, char sex) {
        totalStudent++;
        this.name = name;
        this.sex = sex;
    }

    StudentRecord(String name, char sex, String address, String major) {
        totalStudent++;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.major = major;
    }

    // Constructor overloading
    StudentRecord(String name, double programmingGrade, double linearAlgebraGrade, double dataStructuresGrade,
            double databaseGrade, double networkingGrade) {
        totalStudent++;
        this.name = name;
        this.setProgrammingGrade(programmingGrade);
        this.setLinearAlgebraGrade(linearAlgebraGrade);
        this.setDataStructuresGrade(dataStructuresGrade);
        this.setDatabaseGrade(databaseGrade);
        this.setNetworkingGrade(networkingGrade);
    }

    /* Methods */

    /* Getter/accessor */
    public double getNetworkingGrade() {
        return networkingGrade;
    }

    /* Setter/mutator */
    public void setNetworkingGrade(double networkingGrade) {
        this.networkingGrade = networkingGrade;
    }

    public double getDatabaseGrade() {
        return databaseGrade;
    }

    public void setDatabaseGrade(double databaseGrade) {
        this.databaseGrade = databaseGrade;
    }

    public double getDataStructuresGrade() {
        return dataStructuresGrade;
    }

    public void setDataStructuresGrade(double dataStructuresGrade) {
        this.dataStructuresGrade = dataStructuresGrade;
    }

    public double getLinearAlgebraGrade() {
        return linearAlgebraGrade;
    }

    public void setLinearAlgebraGrade(double linearAlgebraGrade) {
        this.linearAlgebraGrade = linearAlgebraGrade;
    }

    public double getProgrammingGrade() {
        return programmingGrade;
    }

    public void setProgrammingGrade(double programmingGrade) {
        this.programmingGrade = programmingGrade;
    }

    public double getAverage() {
        return (programmingGrade + linearAlgebraGrade + dataStructuresGrade + databaseGrade + networkingGrade) / 5;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }
}

class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord rizqiRecord = new StudentRecord("Kiki Rizqi", 'M'); // New object from a class StudentRecord
        StudentRecord aditRecord = new StudentRecord("Adit Didit", 'M'); 
        StudentRecord dianRecord = new StudentRecord("Dian", 'F', "42 Wallaby Way", "Computer Science"); 
        StudentRecord hartonoRecord = new StudentRecord("Tono Hartono", 100.0, 90.0, 85.0, 88.0, 89.0); 

        // Accessing name
        System.out.println(rizqiRecord.name); 

        // Modifying public attributes
        rizqiRecord.address = "221B Baker St."; 
        rizqiRecord.major = "Informatics Engineering";
        aditRecord.address = "Bleecker St.";
        aditRecord.major = "Mechanical Engineering";

        // Setting a private attributes using setter/mutator
        rizqiRecord.setDataStructuresGrade(90.0);
        rizqiRecord.setDatabaseGrade(100.0);
        rizqiRecord.setLinearAlgebraGrade(85.0);
        rizqiRecord.setNetworkingGrade(89.0);
        rizqiRecord.setProgrammingGrade(100.0);

        // Accessing a private attributes using getter/accessor
        System.out.println("Rizqi's Programming Grade: " + rizqiRecord.getProgrammingGrade());
        System.out.println("Dian's Database Grade: " + dianRecord.getDatabaseGrade());
        System.out.println("Tono's Programming Grade: " + hartonoRecord.getProgrammingGrade());
    }
}