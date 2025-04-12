package bg.tu_varna.sit.а1.f23621666.base;

import bg.tu_varna.sit.а1.f23621666.exceptions.ProgramException;
import bg.tu_varna.sit.а1.f23621666.enums.UserMessages;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Program {
    private String name;
    private Map<Integer, Collection<Subject>> subjectsByCourse = new HashMap<>();

    public Program (String name) throws ProgramException {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws ProgramException {
        if(name == null || name.isEmpty()) {
            throw new ProgramException(UserMessages.PROGRAM_NAME_NULL_VALUE.message);
        }

        this.name = name;
    }

    //Взема мап от предметите по курс и връща като резултат колекция от предмети за всяка година на обучението
    public Map<Integer, Collection<Subject>> getSubjectsByCourse ()
    {
        return this.subjectsByCourse;
    }


    //Запазва предметите за конкретен курс, връща грешка ако номера на курса не е м/у 1-4
    public void setSubjectsByCourse (Integer course, Collection<Subject> courseSubjects) throws ProgramException {

        if(course <= 0 || course > 4 ) {
            throw new ProgramException(UserMessages.PROGRAM_COURSE_WRONG_VALUE.message);
        }
        if (courseSubjects == null || courseSubjects.isEmpty()) {
            throw new ProgramException(UserMessages.PROGRAM_COURSE_SUBJECTS_VALUE.message);
        }

        this.subjectsByCourse.put(course, courseSubjects);
    }
}

