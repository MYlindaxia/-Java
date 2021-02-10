package 第三章;

public class 块级作用域 {
  public static void main(String[] args) {
    {
      int i = 123;

      {
        int j = 321;
        // int i = 123123; 报错!!!
      }
    }
  }
}
