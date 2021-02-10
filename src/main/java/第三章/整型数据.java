package 第三章;

public class 整型数据 {

  public static void main(String[] args) {
    // java中用0x表示十六进制,0表示8进制,0b表示2进制,long类型数字后面要加大写L,数字之间可以加下划线方便阅读
    int num0 = 0xA123;
    int num1 = 010;
    int num2 = 10;
    int num3 = 0b111010;
    long num4 = 13123131312312312L;
    long num5 = 123_123_123_123_123L;

    System.out.printf("%d---%d---%d---%d---%d---%d",num0,num1,num2,num3,num4,num5);
  }
}
