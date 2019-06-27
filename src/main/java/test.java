import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        List<List<String>> result = util();
        System.out.println(result);
    }

    public static List<List<String>> util() {
        List<List<String>> result = new ArrayList<>();
        List<String> tem = new ArrayList<>();
        tem.add("Hello World!");
        result.add(tem);
        tem.remove(0);
        tem.add("this is a test");
        return result;
    }
}
