public class Course {

    int courseCode;
    String courseName;
    int courseCreditHour;
    int maxStudents;

    String studentsList[];

    public void enrolledStudents(){

        System.out.println();
    }


    public void setMaxStudents(int maxStudent) {
       studentsList =  new String[maxStudent] ;
       maxStudents = maxStudent;
    }

    public void addStudent(String studentName, int studentId){

        studentsList[0] = studentName;
    }



}
