package ua.artcode.week3;

import ua.artcode.week3.oop.Group;
import ua.artcode.week3.oop.GroupJsonUtils;
import ua.artcode.week3.oop.Student;

/**
 * Created by serhii on 06.03.16.
 */
public class _06GroupToJson {

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

        String stJson = GroupJsonUtils.studentToJson(st1);

        System.out.println(stJson);


        Student[] list = new Student[6];
        list[0] = st1;
        list[1] = st2;

        String arrJson = GroupJsonUtils.arrToJson(list);
        System.out.println(arrJson);

        Group group = new Group();

        group.name = "ACB14";
        group.size = 10;
        group.list = list;

        System.out.println(GroupJsonUtils.toJson(group));

    }

}
