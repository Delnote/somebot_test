package tests;

import entities.responseEntity.ResponseEntity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static data.KeyboardData.brigadeFormKeyboard;
import static factory.RequestFactory.botCommandMessage;
import static factory.RequestFactory.requestEntity;
import static org.apache.commons.lang3.RandomStringUtils.random;
import static service.RestService.postBrigadeRequest;
import static validation.ValidateBrigadeTools.validateInlineKeyboard;
import static validation.ValidateBrigadeTools.validateMainKeyboard;
import static validation.ValidateBrigadeTools.validateSendMessage;

public class BrigadeBotTests {
    @Test()
    public void startCommandTest() {
        Integer telegramId = Integer.parseInt(random(9, false, true));
        List<ResponseEntity> responseEntity = postBrigadeRequest(
                requestEntity(botCommandMessage(telegramId, "/start"))
        );
        validateSendMessage(responseEntity.get(0), telegramId, "Приветствую!");
        validateMainKeyboard(responseEntity.get(0));
        validateSendMessage(responseEntity.get(1), telegramId, "Заполните, пожалуйста, все поля в анкете");
        validateInlineKeyboard(responseEntity.get(1), brigadeFormKeyboard());
    }
}
