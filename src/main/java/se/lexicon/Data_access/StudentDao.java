package se.lexicon.Data_access;

import se.lexicon.Model.Student;

import java.util.List;

public interface StudentDao {

    Student save(Student student);
    Student find(int id);
    void delete(int id);
    List<Student> findAll();
    Student remove(int id);
    Student edit(Student student);
}
