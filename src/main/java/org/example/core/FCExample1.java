package org.example.core;

public class FCExample1 {
}

class Boxer1 {
    Integer i;
    int x;

    public Boxer1(int y) {
        x = i + y;
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Boxer1(new Integer(4));
    }
}


class Polish {
    public static void main(String[] args) {
        int x = 4;
        StringBuffer sb = new StringBuffer("..fedcba");
        sb.delete(3, 6);
        sb.insert(3, "az");
        if (sb.length() > 6) x = sb.indexOf("b");
        sb.delete((x - 3), (x - 2));
        System.out.println(sb);
    }
}


class TKO {
    public static void main(String[] args) {
        String s = "-";
        Integer x = 343;
        long L343 = 343L;
        if (x.equals(L343)) s += ".e1 ";
        if (x.equals(343)) s += ".e2 ";
        Short s1 = (short) ((new Short((short) 343)) / (new Short((short) 49)));
        if (s1 == 7) s += "=s ";
        if (s1 < new Integer(7 + 1)) s += "fly ";
        System.out.println(s);
    }
}


class Convert {
    public static void main(String[] args) {
        Long xL = new Long(456L);
        long x1 = Long.valueOf("123");
        Long x2 = Long.valueOf("123");
        long x3 = xL.longValue();
        Long x4 = xL.longValue();
        Long x5 = Long.parseLong("456");
        long x6 = Long.parseLong("123");
    }
}
