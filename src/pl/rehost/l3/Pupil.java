package pl.rehost.l3;

public class Pupil extends Person implements InformationProvider {
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if (index <= 0) {
            throw new IndexOutOfBoundsException();
        }
        this.index = index;
    }

    @Override
    public String getInfo() {
        return this.getIndex() + " | " + this.getFirstName() + " " + this.getLastName();
    }
}

