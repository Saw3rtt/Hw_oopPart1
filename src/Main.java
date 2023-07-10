public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 87, 5, 5, 5, 9),
                new Gryffindor("Гермиона", "Грейнджер", 54, 6, 8, 6, 7),
                new Gryffindor("Рон", "Уизли", 60, 3, 2, 4, 5),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 74, 7, 8, 9, 8, 9),
                new Slytherin("Грэхэм", "Монтегю", 44, 5, 4, 6, 6, 8),
                new Slytherin("Грегори", "Гойл", 33, 3, 5, 2, 5, 4),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 69, 4, 4, 4, 4, 7),
                new Ravenclaw("Грэхэм", "Монтегю", 32, 6, 7, 2, 4, 6),
                new Ravenclaw("Грегори", "Гойл", 28, 4, 3, 6, 2, 4),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 50, 6, 7, 8, 4),
                new Hufflepuff("Седрик", "Диггори", 20, 4, 3, 9, 3),
                new Hufflepuff("Джастин", "Джастин", 27, 2, 4, 5, 7),
        };
        System.out.println();
        Gryffindor.compareStudents(gryffindors);
        System.out.println();
        Slytherin.compareSlytherinsStudents(slytherins);
        System.out.println();
        Ravenclaw.compareRavenclawsStudents(ravenclaws);
        System.out.println();
        Hufflepuff.compareHufflepuffStudents(hufflepuffs);
        System.out.println();
        comparison(slytherins, hufflepuffs);
        System.out.println();

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










