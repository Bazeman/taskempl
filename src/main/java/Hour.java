import lombok.Data;
import lombok.Getter;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by OLEG on 08.03.2018.
 */
@Getter
@Data
public class Hour extends  Employ



{

    String Name;
    double Rate;
    int Id;




    public Hour(String Name,double Rate,int id){
this.Name=Name;
this.Rate=Rate;
this.Id=Id;


    }





    @Override
    String getName() {
        return Name;
    }
    @Override
    void setName(String name) {

        this.Name=name;

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

    double Set_salary(double Rate) {

        double Salary=Rate*20.8*8;

        return Salary;
    }
}
