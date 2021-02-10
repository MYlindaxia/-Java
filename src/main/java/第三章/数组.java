package 第三章;

import java.util.Arrays;

public class 数组 {
  public static void main(String[] args) {
    /**
     * 数组定义的几种方法,
     * 创建一个数字数组的时候,所有元素都初始化为0,boolean数组会初始化为false,对对象对元素初始化为null
     */
    int[] arr0 = new int[10];
    int arr1[] = new int[10];
    int[] arr2 = new int[]{1,2,3,4,5,6,7};
    int[] arr3 = {1,2,3,4,5,6,7};

    int[] arr4 = new int[10];
    for(int i = 0;i<10;i++){
      arr4[i] = i + 1;
    }
    int[] arr5 = arr4;

    System.out.println("----");
//    for(int i : arr5){
//      System.out.println(i);
//    }
    int[] arr6 = Arrays.copyOf(arr4, arr4.length);
    arr4[0] = 1111;
    for(int i : arr6){
      System.out.println(i);
    }
    int[] arr7 = Arrays.copyOf(arr6,arr6.length * 2);
    System.out.println("-----");
    for(int i : arr7){
      System.out.println(i);
    }
  }
}
