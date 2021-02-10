package 第三章;

/**
 * 格式化输出还有很多厉害的功能,如果有时间还是要去学习一下
 */
public class 格式化输出 {
  /**
    格式化输出中常用参数
    1. %s : 字符串
    2. %d : 整数
    3. %f : 浮点数
    4. %b : 布尔值
    5. %c : 单个字符
   */
  public static void main(String[] args) {
    float float1 = 0.33333F;
    double float2 = 0.33333333D;
    System.out.printf("%f---%f\n",float1,float2);
    int num1 = 123123;
    long num2 = 123123123123123123L;
    System.out.printf("%d---%d\n",num1,num2);
    String str1 = "Hello";
    String str2 = "Hello World!";
    System.out.printf("%s---%s\n",str1,str2);
    boolean boo1 = true;
    boolean boo2 = false;
    System.out.printf("%b---%b\n",boo1,boo2);

    String name = String.format("Hello My Name is %s,My age is %d","MYlindaxia",20);
    System.out.println(name);
  }
}
