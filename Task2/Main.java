import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static int fillMap(Map<Integer, Integer> map, int value){
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (value >= entry.getKey()){
                value = value - entry.getKey();
                map.put(entry.getKey(), entry.getValue()+1);
                return value;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int orderPrice = Integer.parseInt(args[0]);
        int depositAmount = Integer.parseInt(args[1]);

        Map<Integer, Integer> denominations = new LinkedHashMap<>();
        denominations.put(5000, 0); denominations.put(2000, 0); denominations.put(1000, 0); denominations.put(500, 0);
        denominations.put(200, 0); denominations.put(100, 0); denominations.put(50, 0); denominations.put(10, 0);
        denominations.put(5, 0); denominations.put(2, 0); denominations.put(1, 0);

        int difference = depositAmount-orderPrice;

        while (difference > 0) {
            difference = fillMap(denominations, difference);
        }

        StringBuilder answer = new StringBuilder();
        for(Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            if(entry.getValue()!=0){
                answer.append(entry.getKey().toString()).append("руб: ").append(entry.getValue().toString()).append(" шт., ");
            }
        }
        System.out.println(answer.deleteCharAt(answer.length()-2));
    }
}
