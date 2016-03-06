package ua.artcode.wekk3.oop;

/**
 * Created by serhii on 06.03.16.
 */
public class TestStudent {


    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Ivan";
        st1.birth = "1990-03-23";
        st1.taskCount = 100;
        st1.rank = 3;

        Student st2 = new Student();
        st2.name = "Srhii";
        st2.birth = "1992-03-23";
        st2.taskCount = 80;
        st2.rank = 5;


        String name = "{" + st1.name + "}";

        Student[] list = new Student[6];
        list[0] = st1;
        list[1] = st2;

        Group group = new Group();

        /*System.out.println(group.list);
        System.out.println(group.size);
        System.out.println(group.name);
*/

        group.name = "ACB14";
        group.size = 10;
        group.list = list;

        // debug next code line
        list[0] = null;
    }
}
