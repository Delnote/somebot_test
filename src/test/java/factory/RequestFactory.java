package factory;

import entities.requestEntity.Chat;
import entities.requestEntity.Entity;
import entities.requestEntity.From;
import entities.requestEntity.Message;
import entities.requestEntity.RequestEntity;

import java.time.Instant;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.random;

public class RequestFactory {
    public static RequestEntity requestEntity(Message message) {
        return RequestEntity.builder()
                .updateId(Integer.parseInt(random(9, false, true)))
                .message(message)
                .build();
    }

    public static Message textMessage(Integer telegramId, String text) {
        return massage(telegramId, text, null);
    }

    public static Message botCommandMessage(Integer telegramId, String text) {
        return massage(telegramId, text, new Entity("bot_command", 0, text.length()));
    }

    private static Message massage(Integer telegramId, String text, Entity entity) {
        Integer messageId = Integer.parseInt(random(4, false, true));
        return Message.builder()
                .messageId(messageId)
                .from(new From(telegramId, "D", false, "S", "Dstels", "en"))
                .date((int) Instant.now().getEpochSecond())
                .chat(new Chat(telegramId, "private", "D", "S", "Dstels"))
                .text(text)
                .entities(entity != null ? List.of(entity) : null)
                .build();
    }
}
