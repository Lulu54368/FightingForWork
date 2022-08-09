import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class FindMed
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //use the following code to fetch input from console
        String line;

        BufferedReader br  =  new  BufferedReader(new InputStreamReader(System.in));

        List<String> lst = new LinkedList<>();
        lst.add(br.readLine());
        lst.add(br.readLine());

        List<Integer> selectedNum = new LinkedList<>();
        System.out.println(lst);
        String l = lst.get(1);
        int[] numbers = Arrays.stream(l.substring(0, l.length()-1).split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int num: numbers){

            selectedNum.add(num);
        }


        selectedNum.stream().sorted().toArray();
        System.out.println(selectedNum.get(selectedNum.size()/2));

    }

}

