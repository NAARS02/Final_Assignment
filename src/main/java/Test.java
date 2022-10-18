import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
public class Test {
    public static void main(String[] args) {

        DateTime d1 = new DateTime(2017, 9, 6, 10, 11, 12, 100);
        DateTime d2 = new DateTime(2021, 5, 7, 10, 11, 12, 123);
        DateTime d3 = new DateTime(2018, 9, 8, 10, 11, 12, 123);
        DateTime d4 = new DateTime(2022, 5, 9, 10, 11, 12, 123);
        DateTime d5 = new DateTime(2019, 9, 10, 10, 11, 12, 123);
        DateTime d6 = new DateTime(2024, 5, 12, 10, 11, 12, 123);
        List<Modules> Modules = null;
        List<Course_Programme> Courses= null;
        List<Student> Students= null;
        Student s1 = new Student("Naarayana", 21, "30-07-2001", 19280069);
        Student s2 = new Student("Liam", 21, "05-08-2001", 19280070);
        Student s3 = new Student("Oisin", 21, "20-12-2001", 19280071);

        Course_Programme c1 = new Course_Programme("BCT",d1,d2);
        Course_Programme c2 = new Course_Programme("BME",d3,d4);
        Course_Programme c3 = new Course_Programme("BCE",d5,d6);

        Modules m1 = new Modules("Mechanical Engineering", "ME1","Enda Barrett");
        Modules m2 = new Modules("Chemical Engineering", "CE3","Frank Glavin");
        Modules m3 = new Modules("Software Engineering", "SE2","Owen Molloy");

        s1.addCourses(c1);
        s2.addCourses(c2);
        s3.addCourses(c3);

        s1.addModules(m3);
        s1.addModules(m2);
        s2.addModules(m1);
        s2.addModules(m3);
        s3.addModules(m2);
        s3.addModules(m1);

        m1.addCourses(c2);
        m1.addCourses(c3);
        m2.addCourses(c3);
        m2.addCourses(c1);
        m3.addCourses(c1);
        m3.addCourses(c2);

        m1.addStudents(s2);
        m1.addStudents(s3);
        m2.addStudents(s1);
        m2.addStudents(s3);
        m3.addStudents(s1);
        m3.addStudents(s2);

        c1.addModules(m3);
        c1.addModules(m2);
        c1.addModules(m2);
        c1.addModules(m2);
        c1.addModules(m2);
        c1.addModules(m2);

        c1.addStudents(s1);
        c2.addStudents(s2);
        c3.addStudents(s2);

        c1.addModules(m3);
        c1.addModules(m2);
        c2.addModules(m3);
        c2.addModules(m1);
        c3.addModules(m1);
        c3.addModules(m2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }
}