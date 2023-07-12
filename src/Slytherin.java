public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;

    public Slytherin(String name, String surname, int character, int cunning, int determination, int ambition, int resourcefulness, int magicPower) {
        super(name, surname, character, magicPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return "Лучший Слизерин " + super.toString() + " " +
                "Слизерин " +
                "cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness;
    }

    public Slytherin compareSlytherinsStudent(Slytherin slytherinsStudent) {
        int sumThis = this.cunning + this.determination + this.ambition + this.resourcefulness;
        int sumSlyrtherinStudent = slytherinsStudent.cunning + slytherinsStudent.determination + slytherinsStudent.ambition + slytherinsStudent.resourcefulness;
        Slytherin result = sumThis > sumSlyrtherinStudent ? this : slytherinsStudent;
        return result;
    }
}