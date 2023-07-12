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


    @Override
    public String toString() {
        return "Лучший Пуффендуй " + super.toString() +
                " Пуффендуй " +
                "industriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty;
    }

    public Hufflepuff compareHufflepuffStudent(Hufflepuff hufflepuffStudent) {
        int sumThis = this.industriousness + this.loyalty + this.honesty;
        int sumHufflepufftudent = hufflepuffStudent.industriousness + hufflepuffStudent.loyalty + hufflepuffStudent.honesty;
        Hufflepuff result = sumThis > sumHufflepufftudent ? this : hufflepuffStudent;
        return result;
    }

}

