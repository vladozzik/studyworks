import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    // Поля
    private String name;
    private LocalDate birthDate;
    private String group;
    private int studentId;
    private double averageScore;

    // Конструктор
    public Student(String name, LocalDate birthDate, String group, int studentId, double averageScore) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    // Метод для вычисления возраста студента
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // Метод для представления информации о студенте
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Студент: " + name +
                ", Дата рождения: " + birthDate.format(formatter) +
                ", Группа: " + group +
                ", Код студента: " + studentId +
                ", Средний балл: " + averageScore;
    }

    // Метод для проверки, является ли студент отличником
    public boolean isExcellentStudent() {
        return averageScore >= 4.8;
    }

    // Основной метод для тестирования класса
    public static void main(String[] args) {
        // Создание нескольких объектов класса Student
        Student student1 = new Student("Иван Иванов", LocalDate.of(2003, 5, 15), "Группа A", 12345, 4.9);
        Student student2 = new Student("Мария Петрова", LocalDate.of(2002, 8, 30), "Группа B", 67890, 4.6);
        
        // Тестирование методов
        System.out.println(student1);
        System.out.println("Возраст: " + student1.getAge() + " лет");
        System.out.println("Отличник: " + student1.isExcellentStudent());
        
        System.out.println();
        
        System.out.println(student2);
        System.out.println("Возраст: " + student2.getAge() + " лет");
        System.out.println("Отличник: " + student2.isExcellentStudent());
    }
}
