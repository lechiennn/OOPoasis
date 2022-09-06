package StudentManagement;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor 1.
     */
    public Student() {
        name = "StudentManagement.Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * @param name is name.
     * @param id is id.
     * @param email is email.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    /**
     * Constructor 3.
     * @param s is another student.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}
