//WAP to create a class Student with: name, roll number and display them using object.
//WAP where child class will be inhereting the properties of a parent class.
class Student{
    String Stu_name;
    int Stu_rollNo;
    double Stu_cgpa;

    public Student(String name, int rollno, double cgpa){
        Stu_name=name;
        Stu_rollNo=rollno;
        Stu_cgpa=cgpa;
    }

    public void displayStudentDetails(){
        System.out.println("Name: "+Stu_name+", Roll no: "+Stu_rollNo+", CGPA: "+Stu_cgpa);
    }
}

class InternationalStudents extends Student{
    String Stu_country;

    public InternationalStudents(String name, int rollno, double cgpa, String country){
        super(name, rollno,cgpa);
        Stu_country=country;
    }

    public void displayCountry(){
        System.out.println("Country: "+Stu_country);
    }
}

public class Inheritence{
    public static void main(String[] args){
        InternationalStudents s1= new InternationalStudents("Jack", 235, 7.83, "Nepal");
        s1.displayStudentDetails();
        s1.displayCountry();
    }
}