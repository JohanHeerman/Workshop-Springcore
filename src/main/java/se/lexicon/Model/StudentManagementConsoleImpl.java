package se.lexicon.Model;

import org.springframework.stereotype.Component;
import se.lexicon.Data_access.StudentDao;
import se.lexicon.Scanner.UserInputService;

import java.util.List;
@Component
public class StudentManagementConsoleImpl implements StudentManagement {


   UserInputService scannerService;
   StudentDao studentDao;

    @Override
    public Student create() {
        String name = "Johan Heerman";
        int age = 30;
        String id = "S12345";

        return new Student(name, age, id);
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {
        return studentDao.remove(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        return studentDao.edit(student);
    }
}
