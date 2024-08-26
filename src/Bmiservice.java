public class Bmiservice {

    public int calculate(float weightM, int heightKg) {

        int bmiIndex = (int) (heightKg / (weightM * weightM));

        return bmiIndex;
    }
}