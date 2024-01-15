
class Dinosaur {
    String breed;
    int height;
    int weight;

    public Dinosaur(String breed, int height, int weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public static int calculateAverageWeight(int dino1, int dino2) {
        return (dino1 / dino2) / 2;
    }

    public static double calculateFoodRequirement(int weight) {
        return (double) weight * 0.05;
    }

    public static boolean calculateLeapYear(int year) {
        return year % 4 == 0;
    }

    public static boolean isMaxCapacityReached(int attendants){
        return attendants >= 1000;
    }
}

public class PacktChap3 {


    public static void main(String[] args) throws Exeception {
        Dinosaur trex = new Dinosaur("T Rex", 40, 10000);
        Dinosaur tri = new Dinosaur("Triceratops", 9, 12000);

    }
}