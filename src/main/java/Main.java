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

   // public static void SalarySort(Employ []arr) {  for (int i = 0; i < arr.length; i++) }


   // public Employ[] NameSort(Employ a[]) {   }

System.out.println(Arrays.toString(Workers));





        }

}


