import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course_Programme {
    String courseName;
    List<Modules> modules= new ArrayList<Modules>();
    List<Student> students= new ArrayList<Student>();
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    public Course_Programme(String courseName,DateTime startDate,DateTime endDate)
    {
        this.courseName=courseName;
        this.modules=null;
        this.students=null;
        this.startDate=startDate;
        this.endDate=endDate;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public List<Modules> getModules()
    {
        return modules;
    }
    public void setModules(ArrayList<Modules> modules)
    {
        this.modules=modules;
    }
    public List<Student> getStudents()
    {
        return students;
    }
    public void setStudents(ArrayList<Student> students)
    {
        this.students=students;
    }
    public DateTime getStartDate()
    {
        return startDate;
    }
    public void setStartDate(DateTime startDate)
    {
        this.startDate=startDate;
    }
    public DateTime getEndDate()
    {
        return endDate;
    }
    public void setEndDate(DateTime endDate)
    {
        this.endDate=endDate;
    }
    public void addModules(Modules m1)
    {
        modules.add(m1);
    }
    public void addStudents(Student s1)
    {
        students.add(s1);
    }
    @Override
    public String toString()
    {
        String a = "";
        if(getCourseName()!=null && getStartDate()!=null && getEndDate()!=null) {
            a+= "---------- \n COURSE \n ---------- \n Course:" + getCourseName() + "\n Start Date:" + getStartDate() + "\t End Date:" + getEndDate();
        }
        if(getModules()!=null) {
            a += "\n----------\nMODULES\n----------\n Modules:" + getModules();
        }
        return a;
    }
}
