package ClassLecture1;

import java.time.LocalDate;

public class classLectureTest {
    public static void main(String[] args) {
//        classLecture employee = new classLecture("bob",50.0f);
        Salary salaryemployee = new Salary("dan",30.0f,20 , LocalDate.of(1989,1,3),new Personallity("left brain","red"),new Car("black"));
        System.out.println(salaryemployee);
        salaryemployee.setPronoun("lesbian");
    }
}
