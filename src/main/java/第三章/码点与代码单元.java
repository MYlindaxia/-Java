package 第三章;
/**
  码点是很重要的一点,我没有仔细看
  @author MYlindaxia
 */
public class 码点与代码单元 {
  public static void main(String[] args) {
    String Hi = "Hello";

    // 获取字符串长度
    System.out.println(Hi.length());
    // 获取实际长度,即码点数量
    int cpCount = Hi.codePointCount(0,Hi.length());
    System.out.println(cpCount);
    // 获取指定位置的代码单元
    System.out.println(Hi.charAt(0));
  }
}
