package mm.edu.ytu.erms.service;

import mm.edu.ytu.erms.model.Subject;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface SubjectService {
    public abstract void createSubject(Subject subject);
    public abstract void updateSubject(String code, Subject subject);
    public abstract void deleteSubject(String code);
    public abstract Collection<Subject> getSubjects();
}
