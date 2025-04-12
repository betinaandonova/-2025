package bg.tu_varna.sit.а1.f23621666.base;

import bg.tu_varna.sit.а1.f23621666.exceptions.SubjectException;
import bg.tu_varna.sit.а1.f23621666.enums.UserMessages;

public class Subject {
    private String name;
    private String type;

    public Subject (String name, String type) throws SubjectException {
        setName(name);
        setType(type);
    }


    public String getName() {
        return this.name;
    }

    public void setName (String name) throws SubjectException {
        if (name == null || name.isEmpty()) {
            throw new SubjectException(UserMessages.SUBJECT_NAME_NULL_VALUE.message);
        }

        this.name = name;
    }

    public String getType () {
        return  this.type;
    }

    //Ако избраната дисциплина е различна от mandatory и optional дава SubjectException
    public void setType (String type) throws SubjectException {
        if (!type.equalsIgnoreCase("mandatory") && !type.equalsIgnoreCase("optional")) {
            throw new SubjectException(UserMessages.SUBJECT_TYPE_WRONG_VALUE.message);
        }

        this.type = type.toLowerCase();
    }
}

