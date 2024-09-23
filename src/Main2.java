public class Main2 {
    public static void main(String[] args) {
//        long l = 10_000_000_000L;
//        for(int i = 0; i <= 4; i++){
//            System.out.println(i);

//        int i = 0;
//        while(i <= 4){
//            System.out.println(i);
//            i++;
//        }
//        i = 0;
//        do {
//
//        }while(조건){
//
//        }
//        while(조건){
//            조건이 맞으면 실행
//        }

//        System.out.println(1f/3);
        int coffee = 3000;
        int albaPay = 10030;
        int alba = 1;
        int hourPerCoffee = 4;
        int month = 30;
        int albaTime = 5;
        int time = 8;
        int income = coffee * hourPerCoffee * time * month;

        int employeeIncome = alba * albaPay * albaTime * month;
        System.out.println(income - employeeIncome);

        int money = 3000;
        int coffee1 = 3000;
        if (money - coffee1 >= 0) {
            System.out.println("커피 한 잔");
        } else {
            System.out.println("다음에 올게요.");
        }

        int i = 0;
        while (i <= 30) {
            boolean is3multi = i % 3 == 0;
            boolean is2multi = i % 2 == 0;
            boolean is6multi = is3multi && is2multi;
            boolean isZero = i == 0;
            if(isZero) {
                System.out.println(i + ":" + i +"입니다.");
            } else if (is6multi) {
                System.out.println(i + ":" + i + "입니다");
            } else if (is3multi) {
                System.out.println(i + ":" + (i - 1));
            } else if (is2multi) {
                System.out.println(i + ":" + (i + 1));
            } else {
                System.out.println(i + ":" + "NO");
            }
            i++;
        }

    }
}