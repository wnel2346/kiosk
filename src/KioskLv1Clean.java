import java.util.Scanner;

public class KioskLv1Clean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuNumber = -1;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("[BURGERKING MENU ]");
            System.out.println("1.크리스피 붉닭 치킨 |W5.9|치킨패티,불닭소스,베이컨,양파,양상추가들어간치킨버거");
            System.out.println("2.트러플 머쉬룸 와퍼 |W8.5|소고기패티,각종버섯,양파,토마토,양상추,트러플소스가토핑된버거");
            System.out.println("3.딥 프러플 프라이 |W2.9|감자튀김에 프러틀소스를부운거");
            System.out.println("0.종료");
            System.out.println("메뉴를 선택하세요 (숫자 입력): ");

            if (scanner.hasNextInt()){
                menuNumber = scanner.nextInt();

                if (menuNumber ==0){
                    System.out.println("프로그램을 종료합니다.");
                    isRunning = false;
                }else if (menuNumber ==1 ||menuNumber ==2 ||menuNumber ==3){
                    System.out.println(menuNumber+"잘못된 메뉴 번호입니다. 다시 선택해주세요.");
                }else{
                    System.out.println("유효하지 않은 입력입니다. 숫자를 입력해주세요.");
                    scanner.next();
                }
                System.out.println("------------------------------------");
            }
            scanner.close();
        }


    }
}