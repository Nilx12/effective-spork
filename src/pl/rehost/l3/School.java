package pl.rehost.l3;

import java.awt.event.PaintEvent;
import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher>  teachers ;
    private List<Pupil> pupils;

    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }


    public List<Pupil> getPupils() {
        return pupils;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void annaFabjanska(){
        pupils.clear();
    }
    public void addTEacher(Teacher teacher){
        if( this.teachers == null){
            teachers = new ArrayList<Teacher>();
        }
        teachers.add(teacher);
    }

    public void addPupil(Pupil pupil){
        if( this.pupils == null){
            pupils = new ArrayList<Pupil>();
        }
        pupils.add(pupil);
    }
}
