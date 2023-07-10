public abstract class Hogwarts extends Object {
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


    public String getSurname() {
        return surname;
    }

    public int getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return "Имя " + name +
                        " Фамилия " + surname;

    }
}
