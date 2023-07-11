public class Compare { public static void compareHufflepuffStudents(Hufflepuff[] hufflepuffs) {
    Hufflepuff result = hufflepuffs[0];
    for (Hufflepuff hufflepuff : hufflepuffs) {
        if (!result.equals(hufflepuffs)) result = result.compareHufflepuffStudent(hufflepuff);
    }
    System.out.println(result);
}
    public static void compareRavenclawsStudents(Ravenclaw[] ravenclaws) {
        Ravenclaw result = ravenclaws[0];
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (!result.equals(ravenclaws)) result = result.compareRavenclawStudent(ravenclaw);
        }
        System.out.println(result);
    }

    public static void compareSlytherinsStudents(Slytherin[] slytherins) {
        Slytherin result = slytherins[0];
        for (Slytherin slytherin : slytherins) {
            if (!result.equals(slytherin)) result = result.compareSlytherinsStudent(slytherin);
        }
        System.out.println(result);
    }
    public static void compareStudents(Gryffindor[] gryffindors) {
        Gryffindor result = gryffindors[0];
        for (Gryffindor gryffindor : gryffindors) {
            if (!result.equals(gryffindor)) result = result.compareStudent(gryffindor);
        }
        System.out.println(result);

    }

}

