package pl.rehost.l3;

public class Teacher extends Person {
    private int wage;


    public int getWage() {
        return wage;
    }


    Teacher(String firstName,String lastName,int index)throws BiedaException{
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setWage(index);
    }

    public void setWage(int wage) throws BiedaException {
        if (wage < 1500) {
            throw new BiedaException("Kiepska wypłata");
        }
        this.wage = wage;
    }

    @Override
    public String getInfo() {
        return this.getFirstName() + " " + this.getLastName() + " zarobki: " + this.getWage();
    }
}
