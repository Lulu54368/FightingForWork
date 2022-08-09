import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/*Giving an array of integers, find the most frequent number*/
public class MostFrequent {

    public static void main (String[] args) throws java.lang.Exception{
        String line;

        BufferedReader br  =  new  BufferedReader(new InputStreamReader(System.in));

        List<String> lst = new LinkedList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        while((line = br.readLine())!= null){
            lst.add(line);
        }

        for(int i = 1; i < lst.size();i++){
            String l = lst.get(i);
            int[] numbers = Arrays
                    .stream(l.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int num:numbers){
                hs.put(num, hs.getOrDefault(num, 0)+1);
            }

        }
        hs.entrySet().forEach(System.out::println);

        int max = hs.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    //reversely sort the key
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getKey() - o1.getKey();
                    }
                })
                .max(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            //find the most frequent one
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        }).get().getKey();
        System.out.println(max);

    }
}
