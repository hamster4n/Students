package lesson2;

import java.util.Objects;

/**
 * Created by Hamster4n.
 *
 */
public class Student {


    private int id;
    private String surname;
    private String name;
    private String patronymic; // отчество
    private long birthDate;
    private String adress;
    private String phone;
    private String department; // факультет
    private int course;
    private int group;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Student setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public Student setBirthDate(long date) {
        this.birthDate = birthDate;
        return this;
    }

    public String getAdress() {
        return adress;
    }

    public Student setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Student setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Student setDepartment(String department) {
        this.department = department;
        return this;
    }

    public int getCourse() {
        return course;
    }

    public Student setCourse(int course) {
        this.course = course;
        return this;
    }

    public int getGroup() {
        return group;
    }

    public Student setGroup(int group) {
        this.group = group;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, birthDate, adress, phone, department, course, group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return birthDate == student.birthDate &&
                course == student.course &&
                group == student.group &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(patronymic, student.patronymic) &&
                Objects.equals(adress, student.adress) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(department, student.department);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + adress + '\'' +
                ", phoneNumber='" + phone + '\'' +
                ", faculty='" + department + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }


}
