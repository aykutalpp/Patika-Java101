package week2.Practice;
public class OBSStudent {
    OBSCourse c1;
    OBSCourse c2;
    OBSCourse c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    OBSStudent(String name, String stuNo, String classes, OBSCourse c1, OBSCourse c2, OBSCourse c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2,int note3){
        if (note1 >=0 && note1 <=100){
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <=100){
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <=100){
            this.c3.note = note3;
        }
    }
    void isPass(){
        printNote();

        this.average= (this.c1.note + this.c2.note + this.c3.note)/3.0;
        if (this.average >=55 ){
            System.out.println("Pass");
            this.isPass=true;
        }else System.out.println("You shall not pass");

        System.out.println("Average :"+this.average);

    }

    void calcAverage(){}
    void printNote(){
        System.out.println("=========================");
        System.out.println(this.name);
        System.out.println(this.c1.name + " Note\t:" + this.c1.note);
        System.out.println(this.c2.name + " Note\t\t:" + this.c2.note);
        System.out.println(this.c3.name + " Note\t:" + this.c3.note);

    }

}
