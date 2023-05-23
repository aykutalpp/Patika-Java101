package week2.Practice;

public class OBSMain {

    public static void main(String[] args) {

        OBSTeacher t1 = new OBSTeacher("Aykut Hoca", "HST","534660");
        OBSTeacher t2 = new OBSTeacher("Alp Hoca", "MAT","53244660");
        OBSTeacher t3 = new OBSTeacher("Sena Hoca", "BIO","53244660");

        OBSCourse history = new OBSCourse("History",101,"HST");
        OBSCourse math = new OBSCourse("Math",102,"MAT");
        OBSCourse biology = new OBSCourse("Biology",103,"BIO");

        history.addTeacher(t1);
        math.addTeacher(t2);
        biology.addTeacher(t3);

        OBSStudent s1 = new OBSStudent("ali","123","4",history,math,biology);
        s1.addBulkExamNote(17,90,89);
        s1.isPass();

        OBSStudent s2 = new OBSStudent("veli","321","5",history,math,biology);
        s2.addBulkExamNote(45,57,29);
        s2.isPass();

        OBSStudent s3 = new OBSStudent("kerim","213","3",history,math,biology);
        s3.addBulkExamNote(67,50,59);
        s3.isPass();
    }
}
