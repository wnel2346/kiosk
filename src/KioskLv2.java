import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class KioskLv2 {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("크리스피 붉닭 치킨", 5900, "치킨패티,불닭소스,베이컨,양파,양상추가 들어간 치킨버거"));
        menuItems.add(new MenuItem("트러플 머쉬룸 와퍼", 8500, "소고기패티,각종버섯,양파,토마토,양상추,트러플소스가 토핑된 버거"));
        menuItems.add(new MenuItem("딥 트러플 프라이", 2900, "감자튀김에 트러플 소스를 부은거"));

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n[BURGERKING MENU ]");

            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %s\n", (i + 1), item.getDisplayInfo());
            }
            System.out.println("0. 종료");
            System.out.println("------------------------------------");
            System.out.print("메뉴를 선택하세요 (숫자 입력): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("\n[종료] 프로그램을 종료합니다. 감사합니다.");
                    isRunning = false;
                } else if (choice > 0 && choice <= menuItems.size()) {
                    MenuItem selectedItem = menuItems.get(choice - 1);

                    System.out.println("\n------------------------------------");
                    System.out.println("선택된 메뉴");
                    System.out.printf("  이름: %s\n", selectedItem.getName());
                    System.out.printf("  가격: %,d원\n", selectedItem.getPrice());
                    System.out.printf("  설명: %s\n", selectedItem.getDescription());
                    System.out.println("------------------------------------");

                } else {
                    System.out.println("\n잘못된 메뉴 번호입니다. 메뉴판의 번호를 다시 확인해주세요.");
                }
            } else {
                System.out.println("\n유효하지 않은 입력입니다. 메뉴 번호(숫자)를 입력해주세요.");
                scanner.next();
            }
        }

        scanner.close();
    }
}