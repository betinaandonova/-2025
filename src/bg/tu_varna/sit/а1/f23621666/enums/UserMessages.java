package bg.tu_varna.sit.а1.f23621666.enums;

public enum UserMessages {
    STUDENT_NAME_NULL_VALUE("Student name can not be null."),
    STUDENT_FN_NULL_VALUE("Student faculty number can not be null."),
    STUDENT_PROGRAM_NULL_VALUE("Student program can not be null."),
    STUDENT_GROUP_NULL_VALUE("Student group can not be null."),
    STUDENT_YEAR_WRONG_VALUE ("Student year must be between 1 and 4."),
    STUDENT_STATUS_TYPE_WRONG_VALUE ("Student status must be \"enrolled\", \"dropped\" or \"graduated\"."),
    GRADE_WRONG_VALUE("Grade value must be between 2.00 and 6.00."),

    //Предмети
    SUBJECT_NAME_NULL_VALUE("Subject name can not be null."),
    SUBJECT_TYPE_WRONG_VALUE("Subject type must be \"optional\" or \"mandatory\"."),

    //Учебна програма
    PROGRAM_NAME_NULL_VALUE("Program name can not be null."),
    PROGRAM_COURSE_WRONG_VALUE ("Program course must be between 1 and 4."),
    PROGRAM_COURSE_SUBJECTS_VALUE ("Subjects collection in a program's course can not be null or empty.");


    public final String message;

    UserMessages(String message) {
        this.message = message;
    }
}

