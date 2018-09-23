/**
 * Created by Zhongshan on 2018/9/22.
 */
public class Student {
    private String name;
    private int score;

    public Student(String studentName, int studentScore) {
        name = studentName;
        score = studentScore;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("zhongshan", 100));
        arr.addLast(new Student("A", 2));
        arr.addLast(new Student("B", 3));

        System.out.println(arr);
    }
}
