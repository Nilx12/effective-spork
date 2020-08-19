package pl.rehost.l3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static void populateSchool(School school) throws BiedaException {

        try {
            List<Teacher> teachers = new ArrayList<Teacher>(Arrays.asList(new Teacher("Agnieszka","Kubiś-Lipowska",2300),
                    new Teacher("Piotr","Duch",1800),
                    new Teacher("Tomasz","Jaworski",1800)
            ));
            school.setTeachers(teachers);
        } catch (BiedaException e) {
            System.err.println("Czemu zarabia tak mało? :(");
            throw e;
        }


        //Tablica jak w C, na następnym spotkaniu zrobimy z tego coś bardziej "javowego"

        List<Pupil> pupils = new ArrayList<Pupil>(Arrays.asList(new Pupil("Adam","Mickiewicz",213311),
                new Pupil("Ozjasz","Goldberg",214121),
                new Pupil("Tomasz","Wagner",213314)));

        school.setPupils(pupils);
    }

    static void printInfo(InformationProvider person) {
        System.out.println(person.getInfo());
    }


    public static void main(String[] args) {
        School school = new School();
        try {
            populateSchool(school);
        } catch (Exception e) {
            System.err.println("Zaludnienie szkoły nieudane.");
            e.printStackTrace();
            return;
        }


        // Pętla jak w C, na następnym spotkaniu zrobimy z tego coś bardziej javowego
        school.getPupils().forEach(pupil -> printInfo(pupil));
        school.getTeachers().forEach(teacher -> printInfo(teacher));
    }
}