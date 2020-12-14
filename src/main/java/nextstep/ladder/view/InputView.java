package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {
    public static final int VALID_LENGTH = 5;

    Scanner sc = new Scanner(System.in);
    
    public String getMembers() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return sc.nextLine();
    }

    public int getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        
        return sc.nextInt();
    }
}