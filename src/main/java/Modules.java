import java.util.ArrayList;
import java.util.List;

public class Modules {
    String moduleName;
    String id;
    List<Student> students= new ArrayList<Student>();
    List<Course_Programme> courses= new ArrayList<Course_Programme>();
    String lecturer;
    public Modules(String moduleName,String id,String lecturer)
    {
        this.moduleName=moduleName;
        this.id=id;
        this.students=null;
        this.courses=null;
        this.lecturer=lecturer;
    }
    public String getModuleName()
    {
        return moduleName;
    }
    public void setModuleName(String moduleName)
    {
        this.moduleName=moduleName;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public List<Student> getStudents()
    {
        return students;
    }
    public void setStudents(ArrayList<Student> students)
    {
        this.students=students;
    }
    public List<Course_Programme> getCourses()
    {
        return courses;
    }
    public void setCourses(ArrayList<Course_Programme> courses)
    {
        this.courses=courses;
    }
    public String getLecturer()
    {
        return lecturer;
    }
    public void setLecturer(String lecturer)
    {
        this.lecturer=lecturer;
    }

    public void addCourses(Course_Programme c1)
    {
        courses.add(c1);
    }
    public void addStudents(Student s1)
    {
        students.add(s1);
    }
}