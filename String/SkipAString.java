public class SkipAString {
public static void main(String[] args){
System.out.println(skipstring("bccapplejdk"));
}
static String skipstring(String s){
    if(s.isEmpty())
{
    return "";
}
if(s.startsWith("apple")){
    return skipstring(s.substring(5));
}
else{
    return s.charAt(0)+skipstring(s.substring(1));
}
}

}
