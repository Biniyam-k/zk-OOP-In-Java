public class Students {

    Students(String name){

    }


    int id;
    String name;
    char  section;
    String Grade;
    String Gender;

    public void setName(String studentName) {
       name  = studentName;
    }
    public  void studentInformation(){
        System.out.println("student name"+ name);
        System.out.println("student section"+section);
        System.out.println("student Gender"+Gender);
        System.out.println("student Grade"+Grade);

    }


}
