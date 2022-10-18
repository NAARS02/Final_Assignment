import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    String dob;
    long id;
    String username;
    List<Modules> modules= new ArrayList<Modules>();
    List<Course_Programme> courses= new ArrayList<Course_Programme>();
    public Student(String name,int age,String dob,long id){
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.id=id;
        username=" ";
        this.courses=null;
        this.modules=null;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getDob()
    {
        return dob;
    }
    public void setDob(String dob)
    {
        this.dob=dob;
    }
    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id=id;
    }
    public List<Course_Programme> getCourses()
    {
        return courses;
    }
    public void setCourses(List<Course_Programme> courses)
    {
        this.courses=courses;
    }
    public List<Modules>getModules()
    {
        return modules;
    }
    public void setModules(List<Modules> modules)
    {
        this.modules=modules;
    }
    public String getUsername()
    {
        username=name+age;
        return username;
    }
    public void addModules(Modules m1)
    {
        modules.add(m1);
    }
    public void addCourses(Course_Programme c1)
    {
        courses.add(c1);
    }
    @Override
    public String toString()
    {
        String a="";
        if(getUsername()!=null && getCourses()!=null && getModules()!=null){
            a+="\n"+getUsername()+"\n"+getCourses()+"\n"+getModules()+"\n";
        }
        return a;
    }
}

