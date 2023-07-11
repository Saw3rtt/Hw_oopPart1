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
    public static void comparison(Slytherin[] slytherins, Hufflepuff[] hufflepuffs) {
        int studentPointsHufflepuffs = hufflepuffs[0].getMagicPower() + hufflepuffs[0].getCharacter();
        int studentsPointsSlyzerins = slytherins[0].getMagicPower() + slytherins[0].getCharacter();
        if (studentPointsHufflepuffs > studentsPointsSlyzerins) {
            System.out.println(hufflepuffs[0].getName() + " " + hufflepuffs[0].getSurname() + " обладает большей мощностью магии, чем " + slytherins[0].getName() + " " + slytherins[0].getSurname());
        } else {
            System.out.println(slytherins[0].getName() + " " + slytherins[0].getSurname() + " обладает большей мощностью магии, чем " + hufflepuffs[0].getName() + " " + hufflepuffs[0].getSurname());
        }
    }
}

