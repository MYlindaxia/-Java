package 第三章;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 二维数组 {
  public static void main(String[] args) {
    int[][] arr0 = new int[10][10];
    int[][] arr1 = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    // 要想快速打印一个二维数组的元素列表,可以调用Arrays.deepToString()方法
    System.out.println(Arrays.deepToString(arr0));
    System.out.println("-----");
    System.out.println(Arrays.deepToString(arr1));
  }
}
