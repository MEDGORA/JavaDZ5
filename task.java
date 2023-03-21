import java.util.HashMap;
import java.util.Map;

/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */
public class task {

    public static void main(String[] args) {
    collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }
    
    private static void collectStats(String text) {
        Map<Integer, String> stats = new HashMap<>();
        String[] split = text.split(" ");
        int maxLength = split[0].length();
        for (int i = 0; i < split.length; i++){
            if (split[i].length() > maxLength){
                maxLength = split[i].length();
            }
        }
        for (int i = 1; i <= maxLength; i++){
            String str = "";
            for (int j = 0; j < split.length; j++){
                if (split[j].length() == i){
                    str = str + split[j]+" ";
                }
            }
            if (str.equals("") == false){
                stats.put(i,str);
            }
        }
        for (int i = 1; i <= maxLength; i++){
            if (stats.get(i) != null){
                System.out.println(stats.get(i));
            }
        }
    }
}