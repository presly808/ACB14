package ua.artcode.week2;

public class _08IncreDecrPostPre {

    public static void main(String[] args) {
        int c = 5;

        /*int a = c++;
        System.out.println(a);
        int b = ++c;
        System.out.println(b);
*/
        int res = c++ + ++c;

        // (c = (5+1)) + c(6) = 12
        // c ++;

        System.out.println(res);


        int counter = 0;

        while(counter < 10){
            System.out.println(counter++);
        }

    }
}
