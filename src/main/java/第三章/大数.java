package 第三章;

import java.math.BigDecimal;
import java.math.BigInteger;

public class 大数 {
  public static void main(String[] args) {
    /**
     * 创建BigInteger的两种方式
     * 第一种适合超大数据，第二种适合小数据
     */
    BigInteger num1 = new BigInteger("123123123123123123");
    BigInteger num2 = BigInteger.valueOf(12123123);
    BigDecimal num3 = new BigDecimal("1.123123123123123123");
    BigDecimal num4 = BigDecimal.valueOf(1.123123);
  }
}
