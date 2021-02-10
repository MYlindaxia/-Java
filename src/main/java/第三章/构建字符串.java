package 第三章;

/**
 构建字符串的作用：提升效率,比传统字符串相拼接快多了
 */
public class 构建字符串 {
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    builder.append("MY");
    builder.append("lindaxia");
    String name = builder.toString();
    System.out.println(name);
  }
}
