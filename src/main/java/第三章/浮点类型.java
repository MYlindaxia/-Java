package 第三章;

public class 浮点类型 {
  public static void main(String[] args) {
    /*
      float类型和double类型数字后面要加f和d,只是d可以省略
     */
    float float0 = 0.123123F;
    double double0 = 0.1231231d;
    System.out.printf("%f---%f\n",float0,double0);

    /*
      Double.POSITIVE_INFINITY可以用来表示正无穷大,
      Double.NEGATIVE_INFINITY可以用来表示负无穷大,
      Double.NaN可以用来表示Not A Number
      Double.isNaN()方法可以用来判断一个数字是不是Not A Number
     */

    System.out.println(Double.POSITIVE_INFINITY);
    System.out.println(Double.NEGATIVE_INFINITY);
    System.out.println(Double.NaN);

    double double1 = Double.NaN;

    System.out.println(Double.isNaN(double1));

    /*
      output:0.8999999999999999
      解释:浮点数不适合进行非常精确的运算,如果要进行精确运算,请使用BigDecimal类
     */
    System.out.println(2.0 - 1.1);
  }
}
