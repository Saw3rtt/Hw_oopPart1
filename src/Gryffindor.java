public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int character, int nobility, int honor, int bravery, int magicPower) {
        super(name, surname, character, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }


    public int getHonor() {
        return honor;
    }


    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Лучший Грифиндор " + super.toString() + "\n" + "\n" +
                "Грифиндор " + super.toString() +
                "благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }

    public Gryffindor compareStudent(Gryffindor gryffindorStudent) {
        int sumThis = this.nobility + this.honor + this.bravery;
        int sumGryffindorStudent = gryffindorStudent.getNobility() + gryffindorStudent.getHonor() + gryffindorStudent.getBravery();
        Gryffindor result = sumThis > sumGryffindorStudent ? this : gryffindorStudent;
        return result;
    }

    public static void compareStudents(Gryffindor[] gryffindors) {
        Gryffindor result = gryffindors[0];
        for (Gryffindor gryffindor : gryffindors) {
            if (!result.equals(gryffindor)) result = result.compareStudent(gryffindor);
        }
        System.out.println(result);

    }

}




