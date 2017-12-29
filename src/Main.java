import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private int age;
    public static final int AGE = 18;
    /**
     * 年级
     */
    private int age1;
    /**
     *
     */
    private String a;

    public static void main(String[] args) {
        new Use("zang");
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());
        }
        List<String> a = new ArrayList();
        f(a);
    }

    private static void f(List<String> list) {
        for (String item : list) {
            //...
        }
        String name = "12";
        int age = 0;
        String x = String.format("name:%s,age:%d", name, age);
        System.out.printf(x);
    }


    public Use getUse() {
        Use mUse = new Use("zhanghua");
        return mUse;
    }

    public void valid(Use use) {
        if (use != null) {

        }
    }

    public static void main1(String[] args) {
        System.out.println("emacs0");
        System.out.println("emacs0");
        System.out.println("emacs0");
    }

    public static void main2(String[] args) {
        System.out.println("emacs0");
        System.out.println("emacs0");
        System.out.println("emacs0");
    }

    public static void main4(String[] args) {
        System.out.println();
    }

}