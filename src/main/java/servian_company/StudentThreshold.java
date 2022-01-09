package servian_company;

public class StudentThreshold {

    public static void main(String[] args) {
        int[] points = new int[]{1, 2, 3, 5, 8};
        int result = getResult(4, points);
        System.out.println(result);
    }

    public static int getResult(int threshold, int[] points) {
        if (threshold >= points[points.length - 1]) return points.length;
        int i = 0, j = 1, result = 0;
        while (i < points.length) {
            if (points[i] - points[0] >= threshold) {
                result = result + 1;
                break;
            } else if (i == 0) {
                result = result + 1;
            } else if (i != j) {
                result = result + 1;
                j = j + 2;
            }
            i++;
        }
        return result;
    }
}
