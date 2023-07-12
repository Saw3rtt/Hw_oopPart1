public abstract class Hogwarts {
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

    public void comparison(Hogwarts student) {

        int studentThis = this.getMagicPower() + this.getCharacter();

        int studentHogwards = student.getMagicPower() + student.getCharacter();

        if (studentThis > studentHogwards) {

            System.out.println(this.getName() + " " + this.getSurname() + " обладает большей мощностью магии, чем " + student.getName() + " " + student.getSurname());

        } else {

            System.out.println(student.getName() + " " + student.getSurname() + " обладает большей мощностью магии, чем " + this.getName() + " " + this.getSurname());
        }
    }
}

