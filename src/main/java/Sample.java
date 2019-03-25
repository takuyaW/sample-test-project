public class Sample {
    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println(sample.getMessage());
    }

    public String getMessage() {
      boolean isOverTeenage = false; // boolean型の変数を宣言
      int yourAge = 18; // あなたは18歳

      isOverTeenage = (yourAge >= 10); // あなたは18歳ですが10歳以上ですね？
      if (isOverTeenage) { // isOverTeenage は true が入る
          System.out.println("あなたは10歳以上です！");
      } else {
          System.out.println("あなたは10歳未満です！");
      }
      
      return "Sample!";
    }
}
