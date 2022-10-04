import java.util.*;

class Student{
    private String NAME;
    private String RollNumber;
    private int UgYear;
    private String Branch;
    private float CGPA ;

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setRollNumber(String rollNumber) {
        RollNumber = rollNumber;
    }

    public void setUgYear(int ugYear) {
        UgYear = ugYear;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public String getNAME() {
        return NAME;
    }

    public String getRollNumber() {
        return RollNumber;
    }

    public int getUgYear() {
        return UgYear;
    }

    public String getBranch() {
        return Branch;
    }

    public float getCGPA() {
        return CGPA;
    }

}


class Teacher{
    private String TeacherName;
    private long TeacherID;
    private String Department;
    private String Specialization;


    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public void setTeacherID(long teacherID) {
        TeacherID = teacherID;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public long getTeacherID() {
        return TeacherID;
    }

    public String getDepartment() {
        return Department;
    }

    public String getSpecialization() {
        return Specialization;
    }

}

public class CollegeManagement {
    public static void main(String[] args){
        Scanner scanNum = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);


//        String ==> studentName,RollNo,Branch,teacherName,department,specialization;
//        long  ==> teacherID;
//        int ==> ug year;
//        float ==> cgpa;
        System.out.println("enter numbers of Student's data to add");
        int studentData = scanNum.nextInt();
        System.out.println("enter numbers of Teacher's data to add");
        int teachersData = scanNum.nextInt();

        Student[] StudentData = new Student[studentData];
        Teacher[] TeacherData = new Teacher[teachersData];
        for (int i =0 ; i< studentData;i++){
            StudentData[i] = new Student();
        }
        for (int i =0 ; i< teachersData;i++){
            TeacherData[i] = new Teacher();
        }

        System.out.println("Enter students data respectively");
        for (int j=0;j<studentData;j++)
        {
            System.out.println((j+1)+").enter studentName,RollNo,Branch, UG year, cgpa respectively ");
            StudentData[j].setNAME(scanString.next());
            StudentData[j].setRollNumber(scanString.next());
            StudentData[j].setBranch(scanString.next());
            StudentData[j].setUgYear(scanNum.nextInt());
            StudentData[j].setCGPA(scanNum.nextFloat());
        }

        System.out.println("Enter students data respectively");
        for (int k=0;k<teachersData;k++)
        {
            System.out.println((k+1)+").Enter teacher name, teacherID , Department, specialization");
            TeacherData[k].setTeacherName(scanString.next());
            TeacherData[k].setTeacherID(scanString.nextLong());
            TeacherData[k].setDepartment(scanString.next());
            TeacherData[k].setSpecialization(scanString.next());
        }

        System.out.println("Data added successfully");
        for (int j=0;j<3;j++)
        {
            System.out.println("----****STUDENT DATA NO. "+(j+1)+" ****----");
            System.out.println(StudentData[j].getNAME());
            System.out.println(StudentData[j].getRollNumber());
            System.out.println(StudentData[j].getBranch());
            System.out.println(StudentData[j].getUgYear());
            System.out.println(StudentData[j].getCGPA());
        }


        for (int k=0;k<3;k++)
        {
            System.out.println("----****Teacher DATA NO. "+(k+1)+" ****----");
            System.out.println(TeacherData[k].getTeacherName());
            System.out.println(TeacherData[k].getTeacherID());
            System.out.println(TeacherData[k].getDepartment());
            System.out.println(TeacherData[k].getSpecialization());
        }
    }
}