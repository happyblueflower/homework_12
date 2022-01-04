package homework_12;
public class Student {
    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int compareTo(Object o) {
        if (!(o instanceof Student))
            throw new RuntimeException("不是Student对象");
        Student p = (Student) o;
        if (this.age < p.age) {
            return 1;
        } else if (this.age == p.age) {
            return 0;
        } else {
            return -1;
        }
    }
}

