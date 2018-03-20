import java.util.Arrays;

/**
 * Created by OLEG on 17.03.2018.
 * <p>
 * Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000)
 * <p>
 * и отсортируйте массив по убыванию при помощи сортировки пузырьком.
 * Создайте массив содержащий марки автомобилей, отсортируйте его сначала по возрастанию, потом по убыванию.
 */
public class Sort {


    public static void main(String[] args) throws Exception {


        int[] array = {15, 38, 6, 4, 11, 69, 2, 94, 51, 68, 14, 48, 13, 98, 23, 99, 10, 39, 29, 60};
 String []array2={"daf","lambo","bmw","aec"};

        Arrays.sort(array2);
        bubbleSort(array);

        for (int i = 0; i < array.length; i++) {

            System.out.print("   ||  " + array2[i]);
        }
    }


    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {

                int tmp = arr[i];

                arr[i] = arr[min_i];
                arr[min_i] = tmp;

            }



        }



    }

 public static void bubbleSort(int arr[]){



        for( int i=arr.length-1;i>0;i--){

            for(int j = 0 ; j < i ; j++){


                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }




        }




 }




}

