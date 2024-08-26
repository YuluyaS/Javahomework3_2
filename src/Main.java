public class Main {
    public static void main(String[] args) {

        Bmiservice service = new Bmiservice();

        float weight_m = 1.87F;
        int height_kg = 98;

        int bmi_index = service.calculate(weight_m, height_kg); //
        System.out.println("bmi_index=" + bmi_index);
    }
}