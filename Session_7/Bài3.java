package Session_7;

public class Bài3 {
    static class ScoreUtils {
        public static boolean isPass(double score) {
            return score >= 5.0;
        }

        public static double avg(double[] scores) {
            double sum = 0;
            for (double s : scores) {
                sum += s;
            }
            return sum / scores.length;
        }
    }

    public static void main(String[] args) {
        double myScore = 7.5;
        double[] classScores = {8.0, 5.5, 4.0, 9.0, 6.5};

        boolean check = ScoreUtils.isPass(myScore);
        double avg = ScoreUtils.avg(classScores);

        System.out.println("Điểm : " + myScore);
        System.out.println("Trạng thái: " + (check ? "Đạt" : "Không đạt"));

        System.out.printf("Điểm trung bình : %.2f\n", avg);
    }
}
