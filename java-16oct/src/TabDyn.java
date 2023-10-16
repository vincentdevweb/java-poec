import java.util.ArrayList;

public class TabDyn {
    public static void main(String[] args) {
        ArrayList<Integer> miaou = new ArrayList<Integer>();
        miaou.add(null);
        miaou.get(0);
        miaou.set(0,42);
        miaou.forEach(null);
        miaou.remove(0);
        miaou.size(); // equal lenght
    }
}
