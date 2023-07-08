import java.util.Arrays;

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
        print(gryffindors);
        Gryffindor total = sumPoint(gryffindors);
        System.out.println();
        System.out.println("Лучший Гриффиндорец " + total.getName() + " " + total.getSurname());
        System.out.println();
        Slytherin total1 = sumPointSlytherin(slytherins);
        System.out.println("Лучший Слизерин " + total1.getName() + " " + total1.getSurname());
        System.out.println();
        Ravenclaw total2 = sumPointRavenclaw(ravenclaws);
        System.out.println("Лучший Когтевран " + total2.getName() + " " + total2.getSurname());
        System.out.println();
        Hufflepuff total3 = sumPointHufflepuff(hufflepuffs);
        System.out.println("Лучший Пуффендуй " + total3.getName() + " " + total3.getSurname());
        System.out.println();
        comparison(slytherins,hufflepuffs);

    }

    public static void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getName() + " Фамилия " + gryffindor.getSurname() + ", Свойства характера " + gryffindor.getCharacter() + ", Благородство = " + gryffindor.getNobility() + ", Честь = " + gryffindor.getHonor() + ", Храбрость = " + gryffindor.getBravery() + ".");
        }
    }

    public static Gryffindor sumPoint(Gryffindor[] gryffindors) {
        Gryffindor total = gryffindors[0];
        int sum;
        int max = gryffindors[0].getNobility() + gryffindors[0].getHonor() + gryffindors[0].getBravery();
        for (int i = 1; i < gryffindors.length; i++) {
            sum = gryffindors[i].getNobility() + gryffindors[i].getBravery() + gryffindors[i].getHonor();
            if (sum > max) {
                max = sum;
                total = gryffindors[i];
            }
        }
        return total;
    }

    public static Slytherin sumPointSlytherin(Slytherin[] gryffindors) {
        Slytherin total1 = gryffindors[0];
        int sum;
        int maximum = gryffindors[0].getCunning() + gryffindors[0].getDetermination() + gryffindors[0].getAmbition() + gryffindors[0].getResourcefulness();
        for (int i = 1; i < gryffindors.length; i++) {
            sum = gryffindors[i].getCunning() + gryffindors[i].getDetermination() + gryffindors[i].getAmbition() + gryffindors[i].getResourcefulness();
            if (sum > maximum) {
                maximum = sum;
                total1 = gryffindors[i];
            }
        }
        return total1;
    }

    public static Ravenclaw sumPointRavenclaw(Ravenclaw[] ravenclaws) {
        Ravenclaw total2 = ravenclaws[0];
        int sum;
        int maximum = ravenclaws[0].getWisdom() + ravenclaws[0].getSmart() + ravenclaws[0].getWit() + ravenclaws[0].getFullOfCreativity();
        for (int i = 1; i < ravenclaws.length; i++) {
            sum = ravenclaws[i].getSmart() + ravenclaws[i].getWit() + ravenclaws[i].getWisdom() + ravenclaws[i].getFullOfCreativity();
            if (sum > maximum) {
                maximum = sum;
                total2 = ravenclaws[i];
            }
        }
        return total2;
    }

    public static Hufflepuff sumPointHufflepuff(Hufflepuff[] hufflepuffs) {
        Hufflepuff total3 = hufflepuffs[0];
        int sum;
        int maximum = hufflepuffs[0].getLoyalty() + hufflepuffs[0].getIndustriousness() + hufflepuffs[0].getHonesty();
        for (int i = 1; i < hufflepuffs.length; i++) {
            sum = hufflepuffs[i].getHonesty() + hufflepuffs[i].getLoyalty() + hufflepuffs[i].getIndustriousness();
            if (sum > maximum) {
                maximum = sum;
                total3 = hufflepuffs[i];
            }
        }
        return total3;
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










