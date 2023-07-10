public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, int character, int smart, int wisdom, int wit, int fullOfCreativity, int magicPower) {
        super(name, surname, character, magicPower);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }
    @Override
    public String toString() {
        return "Лучший Когтевран " + super.toString();
    }

    public Ravenclaw compareRavenclawStudent(Ravenclaw ravenclawStudent) {
        int sumThis = this.smart + this.wisdom + this.wit + this.fullOfCreativity;
        int sumRavenclawtudent = ravenclawStudent.smart + ravenclawStudent.wisdom + ravenclawStudent.wit + ravenclawStudent.fullOfCreativity;
        Ravenclaw result = sumThis > sumRavenclawtudent ? this : ravenclawStudent;
        return result;
    }

    public static void compareRavenclawsStudents(Ravenclaw[] ravenclaws) {
        Ravenclaw result = ravenclaws[0];
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (!result.equals(ravenclaws)) result = result.compareRavenclawStudent(ravenclaw);
        }
        System.out.println(result);
    }
}
