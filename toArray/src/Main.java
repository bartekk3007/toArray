import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Integer[] values = arrayList.toArray(Integer[]::new);
        System.out.println(Arrays.toString(values));
    }
}