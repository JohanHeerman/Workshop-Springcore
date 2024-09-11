package se.lexicon.Data_access;

import org.springframework.stereotype.Component;
import se.lexicon.Model.Student;

import java.util.List;
@Component
public class StudentDaoImpl implements StudentDao {


    @Override
    public Student save(Student student) {
        return null;
    }

    public Student find(int id) {
        return null;
    }

    public void delete(int id) {
    }

    public List<Student> findAll() {
        return null;
    }

    public List<Student> students() {
        return null;
    }

}
