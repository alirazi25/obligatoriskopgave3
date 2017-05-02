/*
 * Example from
 * https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm 
 */

import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}