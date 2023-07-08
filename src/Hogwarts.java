public class Hogwarts {
    private String name;
    private String surname;
    private int character;
    private int magicPower;

    public Hogwarts(String name, String surname, int character, int magicPower) {
        this.name = name;
        this.surname = surname;
        this.character = character;
        this.magicPower = magicPower;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

}
