public class Main3 {
    public static void main(String[] args) {
//        String x = "안녕하세요";
//        for (int i = 0; i < 1_000_000; i++){
//            System.out.print(x);
//        }
//        String y = "";
//        for (int i = 0; i < 1_000_000; i++){
//            y += x;
//        }// 느리다
//        System.out.print(y);

        // array
//        int[] coffees = {3000, 2000, 7000};
//        int first = coffees[0];
//        System.out.println(first);
//
//        int[] coffees2 = {6000, 7000, 8000};
//        System.out.println(coffees2.length);
//        for (int i = 0; i < coffees2.length; i++) {
//            System.out.println(coffees2[i] + "원");
//        }

//        array 선언 방법
//        1. 타입[] 변수명 = {값, 값, 값};
//        2. 타입[] 변수명 = new 타입[길이];
        int[] coffees4 = {100, 200, 300};
        int[] coffees3 = new int[3];
//        System.out.println(coffees3[0]);
        for(int i = 0; i <= 2; i++){
            coffees3[i] = coffees4[i];
            System.out.println(coffees3[i]);
        }
        if(coffees3 == coffees4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
