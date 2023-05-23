package week2.Practice;

public class OBSTeacher {
    String name;
    String branch;
    String mpno;

    OBSTeacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
        System.out.println("New Teacher created.");
    }

    public void print(){
        System.out.println("Name = " + this.name+" phone "+this.mpno+" branch is = "+this.branch);
    }
}

