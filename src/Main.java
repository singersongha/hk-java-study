//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        int index = 1;
//        System.out.println(index + index);
//        System.out.println(1 + 1);
//
//        float f = 1.1f;
//        double d = 1.1d;
//        // 형 변환
//        byte b = (byte) (f + d);
//        // 암시적 형변환 : 낮은 것이 높은 것이 됨 ex) byte -> short
//        int i = b;
//
//        char c = 'a'; // char - 한 글자
//        System.out.println((int) c); // 아스키 코드 반환
        // 2~19
//        for(int i = 2; i < 20; i++) {
//            for(int j = 1; j < 10; j++) {
//                // println ln 엔터
//                System.out.println(i + "*" + j + "=" +  i * j);
//            }
//        }
//      int count = 0;
//      for(int i = 1; i <= 5; i++){
//          for(int j = 1; j <= i; j++){
//              System.out.print('*');
//              count++;
//          }
//          System.out.println();
//      }
//        System.out.println(count);
//    }
//}
        for(int i = 1; i <= 5; i++){
          for(int j = 5; j >= i; j--){
              System.out.print('*');
          }
          System.out.println();
      }
    }
}