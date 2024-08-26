public class Bmiservice {

    public int calculate(float arg_weight_m, int arg_height_kg) {

        float weight_m = arg_weight_m;
        int height_kg = arg_height_kg;


        int bmi_index = (int) (height_kg / (weight_m * weight_m));

        return bmi_index;
    }
}