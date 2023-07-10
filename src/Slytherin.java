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
        return "Лучший Слизерин " + super.toString();
    }

    public Slytherin compareSlytherinsStudent(Slytherin slytherinsStudent) {
        int sumThis = this.cunning + this.determination + this.ambition + this.resourcefulness;
        int sumSlyrtherinStudent = slytherinsStudent.cunning + slytherinsStudent.determination + slytherinsStudent.ambition + slytherinsStudent.resourcefulness;
        Slytherin result = sumThis > sumSlyrtherinStudent ? this : slytherinsStudent;
        return result;
    }

    public static void compareSlytherinsStudents(Slytherin[] slytherins) {
        Slytherin result = slytherins[0];
        for (Slytherin slytherin : slytherins) {
            if (!result.equals(slytherin)) result = result.compareSlytherinsStudent(slytherin);
        }
        System.out.println(result);
    }
}