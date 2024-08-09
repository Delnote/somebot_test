package validation;

import entities.responseEntity.InlineKeyboard;
import entities.responseEntity.Keyboard;
import entities.responseEntity.ResponseEntity;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBrigadeTools {
    public static void validateSendMessage(ResponseEntity responseEntity,
                                                            Integer telegramId,
                                                            String text) {
        assertEquals(telegramId.toString(), responseEntity.chatId);
        assertEquals(text, responseEntity.text);
        assertEquals("html", responseEntity.parseMode);
        assertTrue(responseEntity.disableWebPagePreview);
        assertEquals("sendmessage", responseEntity.method);
    }

    public static void validateMainKeyboard(ResponseEntity responseEntity) {
        List<List<Keyboard>> actualKeyboard = responseEntity.replyMarkup.keyboard;
        assertEquals(2, actualKeyboard.size());
        assertEquals(1, actualKeyboard.get(0).size());
        assertEquals(2, actualKeyboard.get(1).size());
        assertEquals("Отправить анкету", actualKeyboard.get(0).get(0).text);
        assertEquals("Моя анкета", actualKeyboard.get(1).get(0).text);
        assertEquals("Помощь", actualKeyboard.get(1).get(1).text);
    }

    public static void validateInlineKeyboard(ResponseEntity responseEntity, Map<Integer, String> keyboard) {
        List<List<InlineKeyboard>> inlineKeyboard = responseEntity.replyMarkup.inlineKeyboard;
        assertEquals(keyboard.size(), inlineKeyboard.size());
        keyboard.forEach((key, value) ->
                assertEquals(keyboard.get(key), inlineKeyboard.get(key).get(0).text)
        );
    }

}
