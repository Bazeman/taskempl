/**
 * Created by OLEG on 08.03.2018.
 */
public class Hour extends  Employ


{


    String name;
    double Salary;
    int id;


    public Hour(String name, double Salary, int id) {


        this.id=id;
        this.name=name;
        this.Salary=Salary;

    }


    @Override



    double Get_Salary(float rate) {
        this.Salary=rate*20.8*8;
        return Salary;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
