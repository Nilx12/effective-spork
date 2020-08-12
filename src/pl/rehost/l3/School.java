package pl.rehost.l3;

import java.util.ArrayList;

public class School {

    private Teacher teacher;
    private ArrayList<Pupil> pupils;

    public void setPupils(ArrayList<Pupil> pupils) {
        this.pupils = pupils;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Pupil> getPupils() {
        return pupils;
    }

    public Teacher getTeacher() {
        return teacher;
    }

}
