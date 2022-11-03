package 模仿电影信息展示;


/*
目标：完成电影信息展示案例

闪光的哈撒韦 9.6 富野由悠季
EVA 9.8 庵野秀明
攻壳机动队 9.9 押井守
 */
public class test {
    public static void main(String[] args){
            /*
            Movie m1 = new Movie("闪光的哈撒韦",9.6,"富野由悠季");
            Movie m2 = new Movie("EVA",9.8,"庵野秀明");
            Movie m3 = new Movie("攻壳机动队",9.9,"押井守");

            Movie[] movies = new Movie[3];
            movies[0] = m1;
            movies[1] = m2;
            movies[2] = m3;    */

            Movie[] movies = new Movie[3];
            movies[0] = new Movie("闪光的哈撒韦",9.6,"富野由悠季");
            movies[1] = new Movie("EVA",9.8,"庵野秀明");
            movies[2] = new Movie("攻壳机动队",9.9,"押井守");

            //遍历数组
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名：" + m.getName());
            System.out.println("电影评分：" + m.getScore());
            System.out.println("原著作者：" + m.getAuthor());
            System.out.println("-----------------");
        }
    }
}
