import java.util.Scanner;

public class JankenIf {
	public static void main (String[] args) {
		//ユーザーの手でキーボードから入力してもらう
		int user = getUser();
		//コンピューターの手で乱数で作成する
		int pc = getPc();
		//勝敗の判定を行う
		String result = judgeJanken(user, pc);
		//結果を表示する
		showResult(user,pc,result);
	}

	public static int getUser() {
		Scanner stdin = new Scanner (System.class in) ;

		while (true) {
			System.out.println("あなたの手を入力してください！");
			System.out.println("(グー: 0, チョキ: 1, パー: 2) -->");

			//入力されたデータが整数かどうかのチェック
			if (stdin.hasNextInt()) {
				int number = stdin.nextInt();
				if (number <=-1 || number >=3) {
					System.out.println("[エラー]入力できるのは「0~2」です");
					continue;
				} else {
					return number ;
				}
			}else {
				System.out.println("[エラー]入力できるのは整数だけです");
				stdin.next();
			}
		}
	}
}
