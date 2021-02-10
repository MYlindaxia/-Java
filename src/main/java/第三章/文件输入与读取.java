package 第三章;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class 文件输入与读取 {
  public static void main(String[] args) {
    /**
     *  这种方法读取文件在1.8版本是无效的
     * Scanner in = new Scanner(Path.of("../../resources/README.md"),StandardCharsets.UTF_8);
     */

    try {
      PrintWriter out = new PrintWriter("./README.md");
      out.println("Test");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
