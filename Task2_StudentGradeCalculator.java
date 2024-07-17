package CodSoftInternshipTask;

import java.util.Scanner;
public class Task2_StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter the number of Subjects:");
        //Here s is number of subjects
        int s=sc.nextInt();
        int total=0;
        System.out.println("Enter the marks obtained in "+s+" Subjects respectively: ");
        for(int i=1;i<=s;i++){
            System.out.print("Enter the marks of Subject"+i+":");
            System.out.println("");
            int marks=sc.nextInt();
            total=total+marks;
        }
        //AP is Average percentage
        double AP=(double)total/s;
        String Grade;
        if (AP>=90){
            Grade="A+";
        }
        else if(AP>=80){
            Grade="A";
        }
        else if(AP>=70){
            Grade="B";
        }
        else if(AP>=60){
            Grade="C";
        }
        else if(AP>=50){
            Grade="D";
        }
        else if(AP>=40){
            Grade="E";
        }
        else{
            Grade="Fail(F)";
        }
        System.out.println("Total marks = "+total);
        System.out.println("Avreage Percentage= "+AP+" %");
        System.out.println("Grade is : "+Grade);
    }
}