/**
 * Created by OLEG on 08.03.2018.
 */
public class Fixed extends  Employ


{


    String Name;
    double Rate;
    int Id;



    public Fixed(String Name,double Rate,int id){
        this.Name=Name;
        this.Rate=Rate;
        this.Id=Id;


    }




    @Override

    String getName() {
        return Name;
    }


    @Override
    void setName(String Name) {
        this.Name=Name;
    }

    @Override
    int getId() {
        return Id;
    }
    @Override
    void setId(int id) {
        this.Id=Id;



    }

    @Override
    double getRate() {
        return Rate;
    }
    @Override
    void setRate(double Rate) {
        this.Rate=Rate;
    }

    @Override
    double Set_salary(double Rate) {


        double Salary=Rate;
        return Salary;
    }
}
