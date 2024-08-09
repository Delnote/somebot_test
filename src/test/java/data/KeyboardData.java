package data;

import java.util.HashMap;
import java.util.Map;

public class KeyboardData {
    public static Map<Integer, String> brigadeFormKeyboard() {
        return new HashMap<>(){{
            put(0, "ФИО");
            put(1, "Номер телефона");
            put(2, "Район проживания");
            put(3, "Стаж работы");
            put(4, "Работа за городом");
            put(5, "Возможность высотных работ");
            put(6, "Закладка трасс");
            put(7, "Сервис");
            put(8, "Ремонт");
        }};
    }
}
