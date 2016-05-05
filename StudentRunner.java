package lesson2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Created by Hamster4n.
 */
public class StudentRunner {
    public static void main(String[] args) {

        List<Student> students = createStudents();

        List<Student> studentsByDepartmen = StudentUtils.findByDepartment(students, "ГИС");
        System.out.println("Список студентов факультета ГИС: " + studentsByDepartmen);

        List<Student> studentByDepartmentAndCourse = StudentUtils.findByDepartmentAndCourse(students, "Бухучёт", 3);
        System.out.println("Список студентов факультета Бухучёт 3го курса: " + studentByDepartmentAndCourse);

        List<Student> studentByUnderYear = StudentUtils.findByUnderYear(students, getTimestamp(01,01,1993));
        System.out.println("Список студентов 1993 и поздних годов рождения: " + studentByUnderYear);


    }

    private static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student()
                .setId(1)
                .setSurname("Лавочкин")
                .setName("Николай")
                .setPatronymic("Петрович")
                .setBirthDate(getTimestamp(10, 8, 1990))
                .setAdress("г.Киев, ул.Ягеля, дом.10, кв.5")
                .setPhone("+38 (067) 555-44-66")
                .setDepartment("ГИС")
                .setCourse(5)
                .setGroup(50)
        );
        students.add(new Student()
                .setId(2)
                .setSurname("Петрова")
                .setName("Валентина")
                .setPatronymic("Сидоровна")
                .setBirthDate(getTimestamp(18, 2, 1995))
                .setAdress("г.Боярка, ул.Врунгеля, дом.8")
                .setPhone("+38 (050) 222-33-21")
                .setDepartment("ГИС")
                .setCourse(1)
                .setGroup(10)
        );
        students.add(new Student()
                .setId(3)
                .setSurname("Сидоров")
                .setName("Иван")
                .setPatronymic("Серпухович")
                .setBirthDate(getTimestamp(14, 5, 1992))
                .setAdress("с.Дальнее")
                .setPhone("+38 (068) 321-56-01")
                .setDepartment("ГИС")
                .setCourse(3)
                .setGroup(30)
        );
        students.add(new Student()
                .setId(4)
                .setSurname("Макаров")
                .setName("Игорь")
                .setPatronymic("Фёдорович")
                .setBirthDate(getTimestamp(5, 2, 1990))
                .setAdress("г.Макаров, ул.Зелёная")
                .setPhone("+38 (050) 378-47-00")
                .setDepartment("ГИС")
                .setCourse(5)
                .setGroup(50)
        );
        students.add(new Student()
                .setId(5)
                .setSurname("Иванченко")
                .setName("Семирамида")
                .setPatronymic("Изиевна")
                .setBirthDate(getTimestamp(30, 6, 1995))
                .setAdress("г.Столыпинск, ул.Ленина, дом.5, кв.11")
                .setPhone("+38 (067) 359-92-74")
                .setDepartment("ГИС")
                .setCourse(1)
                .setGroup(10)
        );
        students.add(new Student()
                .setId(6)
                .setSurname("Цукерман")
                .setName("Раиса")
                .setPatronymic("Симеоновна")
                .setBirthDate(getTimestamp(29, 3, 1993))
                .setAdress("г.Измаил, ул.Русская, дом.5")
                .setPhone("+38 (096) 551-47-44")
                .setDepartment("Бухучёт")
                .setCourse(3)
                .setGroup(31)
        );
        students.add(new Student()
                .setId(7)
                .setSurname("Сахаров")
                .setName("Изяслав")
                .setPatronymic("Бедросович")
                .setBirthDate(getTimestamp(17, 11, 1993))
                .setAdress("г.Одесса, ул.Пестеля, дом.14")
                .setPhone("+38 (050) 963-85-21")
                .setDepartment("Бухучёт")
                .setCourse(3)
                .setGroup(31)
        );
        students.add(new Student()
                .setId(8)
                .setSurname("Амосова")
                .setName("Светлана")
                .setPatronymic("Игоревна")
                .setBirthDate(getTimestamp(25, 12, 1993))
                .setAdress("с.Привольное, ул.Ягодная")
                .setPhone("+38 (050) 147-77-87")
                .setDepartment("Бухучёт")
                .setCourse(3)
                .setGroup(31)
        );
        students.add(new Student()
                .setId(9)
                .setSurname("Кощей")
                .setName("Николай")
                .setPatronymic("Бессмертович")
                .setBirthDate(getTimestamp(1, 9, 1795))
                .setAdress("Танзания")
                .setPhone("+38 (050) 050-05-00")
                .setDepartment("Бухучёт")
                .setCourse(4)
                .setGroup(41)
        );
        students.add(new Student()
                .setId(10)
                .setSurname("Скайвокер")
                .setName("Анакен")
                .setPatronymic("Батькович")
                .setBirthDate(getTimestamp(14, 5, 1991))
                .setAdress("Татуин")
                .setPhone("+38 (067) 067-06-70")
                .setDepartment("Бухучёт")
                .setCourse(4)
                .setGroup(41)
        );
        students.add(new Student()
                .setId(11)
                .setSurname("Чубака")
                .setName("Пёс")
                .setPatronymic("СобакОвич")
                .setBirthDate(getTimestamp(3, 11, 1991))
                .setAdress("Татуин")
                .setPhone("+38 (067) 288-49-11")
                .setDepartment("Бухучёт")
                .setCourse(4)
                .setGroup(41)
        );
        students.add(new Student()
                .setId(12)
                .setSurname("Яблучкова")
                .setName("Геля")
                .setPatronymic("Скорпионовна")
                .setBirthDate(getTimestamp(13, 11, 1995))
                .setAdress("г.Буча, ул.Лесная, дом.13")
                .setPhone("+38 (050) 365-65-65")
                .setDepartment("Бухучёт")
                .setCourse(1)
                .setGroup(11)
        );

        return students;
    }

    private static long getTimestamp(int dayOfMoth, int month, int year) {
        return new GregorianCalendar(year, month - 1, dayOfMoth).getTime().getTime();
    }
}
