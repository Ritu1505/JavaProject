package Collection;

import java.util.Objects;

public class Students implements Comparable<Students> {
    String name;
    int rollNo;
    public Students(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "Students{" +
                "name: " + name + " RollNo: " + rollNo +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return rollNo == students.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Students that) {
        return this.rollNo - that.rollNo;
    }
}
