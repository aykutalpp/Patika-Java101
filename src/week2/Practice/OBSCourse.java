package week2.Practice;
public class OBSCourse {
    OBSTeacher teacher;
    String name;
    int code;
    String prefix;
    int note;

    OBSCourse(String name, int code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }

    public void addTeacher(OBSTeacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
        }else System.out.println("Teacher is not valid for this course.");

    }
    void printTeacherInfo(){
        this.teacher.print();
    }
}
