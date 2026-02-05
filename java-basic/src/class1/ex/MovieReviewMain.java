package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "\"인셉션\"";
        inception.review = "\"인생은 무한 루프\"";
        
        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "\"어바웃 타임\"";
        aboutTime.review = "\"인생 시간 영화!\"";

        MovieReview[] movieReviews = {inception, aboutTime};
        for (MovieReview MR : movieReviews) {
            System.out.println("영화 제목: " + MR.title + ", 리뷰: " + MR.review);
        }
    }
}
