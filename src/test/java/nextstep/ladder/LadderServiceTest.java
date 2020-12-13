package nextstep.ladder;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.service.LadderService;

public class LadderServiceTest {
    LadderService ladderSvc = new LadderService();
    
    @Test
    void setupLadderTest(){
        String[] test = {"test1","test2","test3","test4"};
        int size = 4;

        Ladder ladder = ladderSvc.setupLadder(test, size);

        assertThat(ladder.getLadder().size()).isEqualTo(4);
        assertThat(ladder.getLadder().get(0).length).isEqualTo(7);
        assertThat(ladder.getLadder().get(0)[0]).isEqualTo(2);
    }
}