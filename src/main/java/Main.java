import java.util.Arrays;

/**
 * Created by OLEG on 08.03.2018.
 */
public class Main {

    public static void main(String[] args) throws Exception {


        Employ[] Workers = new Employ[8];

        Workers[0] = new Hour("Oleg", 50, 1);
        Workers[1] = new Fixed("Lena", 50000, 2);
        Workers[2] = new Hour("Gena", 40, 3);
        Workers[3] = new Hour("Loop", 30, 4);
        Workers[4] = new Hour("Hire", 20, 5);
        Workers[5] = new Fixed("Moon", 5000, 6);
        Workers[6] = new Fixed("Pool", 25000, 7);
        Workers[7] = new Fixed("Xena", 7500, 8);


        bubbleSort(Workers);

        for(int i=0;i<Workers.length;i++){

            System.out.print(Workers[i]);
            System.out.println(" --Salary -- "+ Workers[i].Set_salary(Workers[i].getRate()));
        }


    }



    public static void bubbleSort(Employ arr[]){
        for( int i=arr.length-1;i>0;i--){

            for(int j = 0 ; j < i ; j++){


                if( arr[j].Set_salary(arr[j].getRate()) > arr[j].Set_salary(arr[j].getRate()) ){

                    Employ tempEmploy= new Fixed("temp",1,1);
                    tempEmploy = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempEmploy;
                }
            }




        }




    }








}


