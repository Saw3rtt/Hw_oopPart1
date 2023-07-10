public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int character, int industriousness, int loyalty, int honesty, int magicPower) {
        super(name, surname, character, magicPower);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public String toString() {
        return "Лучший Пуффендуй " + super.toString();
    }

    public Hufflepuff compareHufflepuffStudent(Hufflepuff hufflepuffStudent) {
        int sumThis = this.industriousness + this.loyalty + this.honesty;
        int sumHufflepufftudent = hufflepuffStudent.industriousness + hufflepuffStudent.loyalty + hufflepuffStudent.honesty;
        Hufflepuff result = sumThis > sumHufflepufftudent ? this : hufflepuffStudent;
        return result;
    }

    public static void compareHufflepuffStudents(Hufflepuff[] hufflepuffs) {
        Hufflepuff result = hufflepuffs[0];
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (!result.equals(hufflepuffs)) result = result.compareHufflepuffStudent(hufflepuff);
        }
        System.out.println(result);
    }
}
