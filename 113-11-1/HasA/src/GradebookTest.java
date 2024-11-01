public class GradebookTest {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 3;
        Student[] students = new Student[NUMBER_OF_STUDENTS];
        students[0] = new Student("A112221009", "王小明");
        students[1] = new Student("A112221010", "陳小華");
        students[2] = new Student("A112221011", "李小強");
        GradeBook gradeBook = new GradeBook("Java 程式設計", students, NUMBER_OF_STUDENTS);
        gradeBook.procesStudentsGrades();
        gradeBook.displayGradeReport();
    }
}
