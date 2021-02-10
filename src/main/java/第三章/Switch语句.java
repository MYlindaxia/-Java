package 第三章;

import java.util.Scanner;

/**
 * 现在switch语句支持byte，short，int，char，枚举常量，字符串
 */
public class Switch语句 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入命令:");
    String str = scanner.nextLine();
    switch (str) {
      case "yes" :
        System.out.println("Yes");
        break;
      case "no" :
        System.out.println("no");
        break;
      default:
        System.out.println("you enter Error");
    }
  }
}
