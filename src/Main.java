
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 700;
        int miles = service.calculate(price);
        System.out.println();
        System.out.println("Мили: " + miles);
    }
}