/*
A HighSchool application has two classes: the Person superclass and the Student subclass. 
Using inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. 
A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and subject (e.g. 
-Computer Science-, -Chemistry-, -English-, -Other-). 
The CollegeStudent class will extend the Student class by adding a year (current level in college) and major (e.g. -Electrical Engineering-, -Communications-, -Undeclared-).
**/
class person{
    String name;
}

class Student extends person{
    int rollNo;
}

class Teacher extends person{
    String subject;
    double salary;

    Teacher(String n,String sub,double sal){
        name = n;
        subject = sub;
        salary = sal;
    }
    void display() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name + ", Subject: " + subject + ", Salary: " + salary);    
    }
}

class CollegeStudent extends Student{
    int year;
    String Major;
    CollegeStudent(String n, int roll, int y, String maj){
        name = n;
        rollNo = roll;
        year = y;
        Major = maj;
    }

    void display(){
        System.out.println("Student Details:");
        System.out.println("Name: " + name + ", RollNo: " + rollNo + ", year: " + year + ", Major: " + Major);
    }
}


public class solution {
    public static void main(String[] args) {
        Teacher t = new Teacher("Severus Snape", "Dark Arts", 1000000);
        CollegeStudent s = new CollegeStudent("Harry", 1, 7, "Magic");
        t.display();
        s.display();
    }
}
