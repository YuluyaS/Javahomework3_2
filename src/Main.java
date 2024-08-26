public class Main {
    public static void main(String[] args) {

        Bmiservice service = new Bmiservice();

        float weightM = 1.87F;
        int heightKg = 98;

        int bmiIndex = service.calculate(weightM, heightKg); //
        System.out.println("bmiIndex=" + bmiIndex);
    }
}