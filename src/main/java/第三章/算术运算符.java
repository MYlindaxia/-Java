package 第三章;

public class 算术运算符 {
  public static void main(String[] args) {
    /*
      当进行除法的两个数都是整数时表示整数除法,否则表示小数除法
     */
    System.out.println(3/ 2);
    System.out.println(3 / 2.0);
    System.out.println(3.0 / 2.0);

    /*
      当整数除以0时会抛出异常,而小数除以0则会得到无穷大或者NaN
      System.out.println(5 / 0);
     */

    System.out.println(3.0 / 0);

    /*
      当一个二元运算符连接两个值时,要先将两个操作数转化为同一类型,然后再计算
      1. 如果两个操作数中有一个是double类型,另一个操作数就会变为double类型
      2. 如果一个操作数是float类型,另一个操作数就会转换为float类型
      3. 如果一个操作数是long类型,另一个操作数是long类型,
      否则两个操作数都将变为int类型
     */

  }
}
