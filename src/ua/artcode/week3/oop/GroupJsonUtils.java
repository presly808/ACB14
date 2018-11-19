package ua.artcode.week3.oop;

/**
 * Created by serhii on 06.03.16.
 */
public class GroupJsonUtils {


    public static String studentToJson(Student student) {
        return String.format(
                "{ \"name\" : \"%s\", \"birth\" : \"%s\", \"taskCount\" : %d, \"rank\" : %d}",
                student.name, student.birth, student.taskCount, student.rank);
    }

    public static String arrToJson(Student[] students) {

        String container = "[";

        for (int i = 0; i < students.length; i++) {
            Student st1 = students[i];
            container += (st1 != null ? studentToJson(st1) + "," : "");
        }

        container = container.endsWith(",") ?
                container.substring(0, container.length() - 1) : container;


        return container + "]";
    }

    // toJson -> arrToJson -> studentToJson
    public static String toJson(Group group) {


        return String.format("{\"name\" : \"%s\", \"count\" : %d, \"list\" : %s}",
                        group.name, group.size, arrToJson(group.list));
    }

}
