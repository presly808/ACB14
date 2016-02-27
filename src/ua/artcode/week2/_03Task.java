package ua.artcode.week2;

/**
 * Created by serhii on 27.02.16.
 */
public class _03Task {


    public static void main(String[] args) {
        int lowRange = 0;
        int highRange = 100;
        int count = highRange;

        while(count >= lowRange){
            System.out.print(count + " ");
            count = count - 2;// count -= 2;
        }

        count = 0;

        System.out.println();
        while(count < highRange && count % 2 != 0){
            System.out.print(count + " ");
            count += 2;
        }


        int var = 0;
        while(var < 10){
            System.out.println(var);
            var++;
        }

        for(int j = 0; j < 10; j++){
            // action
            System.out.println(j);
        }

        // j++

    }
}
