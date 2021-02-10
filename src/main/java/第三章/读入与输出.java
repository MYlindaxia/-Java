package 第三章;

import java.io.Console;
import java.util.Scanner;

public class 读入与输出 {
  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    System.out.println("What's your name?");
//    String name = in.nextLine();
//    System.out.println(name);

    /*
      Scanner会将输入的信息显示在控制台,不适合密码输出,所以要用Console
      但是Sconsole有一个坏处,那就是只能一行一行读取,而且读取密码必须是char数组类型
     */
    Console cons = System.console();
    String username = cons.readLine("UserName:");
    char[] password = cons.readPassword("Password:");
  }
}
