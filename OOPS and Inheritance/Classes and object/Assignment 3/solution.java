/*
Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. Here’s what the class should do:

Construct a class called Patient

Store a String name for the patient

Store weight and height for patient as doubles

Construct a new patient using these values

Write a method called BMI which returns the patient’s BMI as a double. BMI can be calculated as BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703

Next, construct a class called Patients and create a main method. Create a Patient object and assign some height and weight to that object. Display the BMI of that patient.

**/

public class solution {
    public static void main(String[] args) {
        Patient p1 = new Patient(112.4, 66.8);
        System.out.println("BMI: "+p1.BMI());
    }   
}

class Patient{
    String patient;
    double weight,height;

    Patient(double w,double h){
        weight = w;
        height = h;
    }
    double BMI() {
        double bmi = ((weight/height*height))/703;
        return bmi;
        
    }
}
