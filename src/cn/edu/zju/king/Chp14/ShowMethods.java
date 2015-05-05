package cn.edu.zju.king.Chp14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by king on 15-4-1.
 */
public class ShowMethods {
    private static String usage = "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(1);
        }
        int lines = 0;
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1) {
                for (Method m: methods)
                    System.out.println(p.matcher(m.toString()).replaceAll(""));
                for (Constructor ctor: ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            } else {
                for (Method m: methods)
                    if (m.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(m.toString()).replaceAll(""));
                        lines++;
                    }
                for (Constructor ctor: ctors)
                    if (ctor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch (final Exception e) {
            System.out.println("No such class");
        }
    }
}
