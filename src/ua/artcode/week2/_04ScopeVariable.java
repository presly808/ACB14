package ua.artcode.week2;

/**
 * Created by serhii on 27.02.16.
 */
public class _04ScopeVariable {


    public static void main(String[] args) {
        int mainI = 0;

        if(true){
            double ifJ = 0;

            if(true){
                int c = 34;
            }

            for (int i = 0; i < 19; i++) {
                i++;
                mainI++;
            }

            //i = 34;
        }

    }
}
