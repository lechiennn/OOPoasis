package StudentManagement;

public class StudentManagement {

    static Student[] students = new Student[100];
    static int index = 0;

    /**
     * check if two students had same group.
     *
     * @param s1 is student 1.
     * @param s2 is student 2.
     * @return true if same group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * add student to array.
     *
     * @param newStudent is new student.
     */
    public void addStudent(Student newStudent) {
        students[index] = newStudent;
        index++;
    }

    /**
     * get info students by group.
     *
     * @return info students by group.
     */
    public String studentsByGroup() {
        StringBuilder str = new StringBuilder();
        String[] arrGroup = new String[100];
        int indexArrGroup = 1;
        arrGroup[0] = students[0].getGroup();

        for (Student student : students) {
            if (student == null) {
                break;
            }
            boolean found = false;
            String grStudent = student.getGroup();
            for (int j = 0; j < indexArrGroup; j++) {
                if (arrGroup[j].equals(grStudent)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            arrGroup[indexArrGroup] = grStudent;
            indexArrGroup++;
        }
        for (int i = 0; i < indexArrGroup; i++) {
            String gr = arrGroup[i];
            str.append(gr).append("\n");
            for (Student student : students) {
                if (student == null) {
                    break;
                }
                String grStudent = student.getGroup();
                if (gr.equals(grStudent)) {
                    str.append(student.getInfo()).append("\n");
                }
            }
        }
        return str.toString();
    }

    /**
     * remove student.
     *
     * @param id is id.
     */
    public void removeStudent(String id) {
        int removeID = -1;
        for (int i = 0; i < index; i++) {
            if (students[i].getId().equals(id)) {
                removeID = i;
                break;
            }
        }
        if (removeID == -1) {
            return;
        }
        for (int i = removeID; i < index; i++) {
            students[i] = students[i + 1];
        }
        students[index - 1] = null;
        index--;
    }
}