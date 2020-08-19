package pl.rehost.l3;

public class Pupil extends Person{
    private int index;

    public int getIndex() {
        return index;
    }

    Pupil(){

    }
    Pupil(String firstName,String lastName,int index)throws BiedaException{
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setIndex(index);
    }

    public void setIndex(int index) {
        if (index <= 0) {
            throw new IndexOutOfBoundsException();
        }
        this.index = index;
    }

    public String getInfo() {
        return this.getIndex() + " | " + this.getFirstName() + " " + this.getLastName();
    }
}

