import java.util.Arrays;

public class Main {

//    Main(){
//
//        System.out.println("the first to invoke");
//    }
    public static void main(String[] args) {

//        Main main = new Main()
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight1.setFlightSource("Addis Abeba ");
        flight1.setFlightDestination("Dubai");
        flight1.totalPassengers(7);

        flight1.setTicketPrice(2500);


        String []passengers = {"hanna","abel","bekalu","dani","abeba","alex"};


        for (int i = 0; i < passengers.length; i++) {

            flight1.addPassenger(passengers[i], i);
        }


        System.out.println(Arrays.toString(flight1.getPassengersList()));

        System.out.println(   flight1.getTicketPrice());
        System.out.println(flight1.getFlightDestination());


Students students = new Students("Abel");


//        Students Abel_obj1 = new Students();
//
//        Abel_obj1.name = "Abel Kebede";
//        Abel_obj1.id = 1299;
//        Abel_obj1.Gender="Male";
//        Abel_obj1.section= 'A';
//        Abel_obj1.Grade = "12";
//
//
//        Students Hanna_obj1 = new Students();
//
//        Hanna_obj1.name = "Hanna Assefa";
//        Hanna_obj1.id = 1298;
//        Hanna_obj1.Gender="female";
//        Hanna_obj1.section= 'A';
//        Hanna_obj1.Grade = "12";
//
//
//        Abel_obj1.studentInformation();
//
//        Course math =  new Course();
//
//        math.courseCode = 244;
//        math.courseName = "Math";
//        math.setMaxStudents(6);
//        math.courseCreditHour = 6;
//        math.addStudent("Hanna",1);
//        math.addStudent("Abel",2);





        // classname objectName = new classname();

//       Bicycle mountainBike = new Bicycle();
//       Bicycle sportBicycle = new Bicycle();
//
//
//
//       mountainBike.increaseSpeed();
//       sportBicycle.increaseSpeed();
    }
}