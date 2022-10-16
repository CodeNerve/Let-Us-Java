import java.util.ArrayList;
import java.util.HashSet;

public class Algorithm_Day6_PermutationinString {
    public static boolean checkInclusion(String s1, String s2) {
        int L = 0;
        int R = s1.length()-1;
        ArrayList<Character> c = new ArrayList<>();
        for(int i=0;i<s1.length();i++) {
            c.add(i,s1.charAt(i));
        }
        while (R < s2.length()) {
            ArrayList<Character> cs = (ArrayList<Character>) c.clone();
            for(int i=L;i<=R;i++) {
                if(!cs.contains(s2.charAt(i))) {
                    L++;
                    R++;
                    break;
                }
                else {
                   cs.remove(cs.indexOf(s2.charAt(i)));
                }
            }
            if(cs.size()==0) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "cabb";
        int L = 0;
        int R = s1.length()-1;
        ArrayList<Character> c = new ArrayList<>();
        for(int i=0;i<s1.length();i++) {
            c.add(i,s1.charAt(i));
        }
        System.out.println(c);
        ArrayList<Character> cs = new ArrayList<>();
        while (R < s2.length()) {
            cs = (ArrayList<Character>) c.clone();
            for(int i=L;i<=R;i++) {
                if(!cs.contains(s2.charAt(i))) {
                    L++;
                    R++;
                    break;
                }
                else {
                    cs.remove(cs.indexOf(s2.charAt(i)));
                    System.out.println(cs);
                }
            }
            if(cs.size()==0) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        /*ArrayList<Character> c = new ArrayList<>();
        ArrayList<Character> cs = new ArrayList<>();
        c.add('b');
        c.add('b');
        c.add('b');
        cs = (ArrayList<Character>) c.clone();
        System.out.println(cs);
        cs.remove(cs.indexOf('b'));
        System.out.println(c);
        System.out.println(cs);
        cs = (ArrayList<Character>) c.clone();
        System.out.println(cs);*/
    }
}
