import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoverCeros {

    public static List<Object> moveZeros(List<Object> input) {
        List<Object> result = new ArrayList<>();
        int zeroCount = 0;

        for (Object element : input) {
            if (element instanceof Integer && (Integer) element == 0) {
                zeroCount++;
            } else {
                result.add(element);
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            result.add(0);
        }

        return result;
    }

    public static void main(String[] args) {
    	//Esta es la lista que se usa como ejemplo
    	List<Object> input = new ArrayList<>(Arrays.asList(false, 1, 0, 1, 2, 0, 1, 3, "a"));
        List<Object> result = moveZeros(input);
        //Así deberia de salir el resultado ordenado: [false, 1, 1, 2, 1, 3, "a", 0, 0]
        System.out.println(result);
    }
}
