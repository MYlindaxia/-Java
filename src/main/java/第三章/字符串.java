package 第三章;

public class 字符串 {
  public static void main(String[] args) {
    String greetig = "Hello";
    String nullStr = "";
    String name = "我是林大侠";

    /*
      千万不要用==来测试两个字符串相等,要用equals
     */
    if(greetig == "Hello"){
      System.out.print("相同");
    }
    if(greetig.substring(0,3) == "Hel"){
      System.out.println("这个也相同");
    }

    if(nullStr == null){
      System.out.println("是null");
    }

    System.out.printf("我名字的长度是%d",name.length());
  }
}
