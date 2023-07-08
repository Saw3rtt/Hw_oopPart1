public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, int character, int smart, int wisdom, int wit, int fullOfCreativity,int magicPower) {
        super(name, surname, character, magicPower);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
}
