/**
 * Created by OLEG on 08.03.2018.
 */
public class Fixed extends  Employ


{



    String name;
    double Salary;
    int id;


    public Fixed(String name, double Salary, int id) {

    }


    @Override
    double Get_Salary(float rate) {
        this.Salary=rate;
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
