package 模仿电影信息展示;

public class Movie {
    // 成员变量
    private String name;
    private double score;
    private String author;

    //构造器

    public Movie() {
    }

    public Movie(String name, double score, String author) {
        this.name = name;
        this.score = score;
        this.author = author;
    }

    // getter + setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
