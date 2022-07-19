
public class DoWhile01 {
    public static void main(String[] args) {
        int number = 1;
        // do-while文：ループ開始
        do {
            // ブロック：
            // numberにnumber * 2 を代入して、numberを出力
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        // do-while文：
        // numberが50未満の場合、ブロックの処理をループ実行する
        } while (number < 50);
    }
}