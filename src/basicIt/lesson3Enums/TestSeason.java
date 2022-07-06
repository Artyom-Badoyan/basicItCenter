package basicIt.lesson3Enums;

public class TestSeason {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        Season season1 = Season.WINTER;
        Season season2 = Season.AUTUMN;
        Season season3 = Season.SPRING;


        switch (season) {
            case SUMMER:
                System.out.println("it is warm outside");
                break;
        }


        switch (season1) {
            case WINTER:
                System.out.println("it is cold outside");
                break;
        }


        switch (season2) {
            case AUTUMN:
                System.out.println("it is normal outside");
                break;
        }


        switch (season3) {
            case SPRING:
                System.out.println("it is good outside");
                break;

        }
    }
}

