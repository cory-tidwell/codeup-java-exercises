public class ArrayLecture {
    public static void main(String[] args) {
        String[] weatherType = new String[4];
        weatherType[0] = "cloudy";
        weatherType[1] = "sunny";
        weatherType[2] = "windy";
        weatherType[3] = "rainy";

        System.out.println(weatherType[0]);
        System.out.println(weatherType[1]);
        System.out.println(weatherType[2]);
        System.out.println(weatherType[3]);

        long[] dailyStep = {654, 784, 9983, 2321, 10094, 4439, 39483,};
        for (long element: dailyStep) {
            System.out.println(element);
        }

    }
}
