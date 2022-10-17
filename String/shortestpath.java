package String;
public class shortestpath {
    public static float shortestPath(String str){
       int x=0,y=0;
            for(int i=0;i<str.length();i++){
                char dir=str.charAt(i);
                //EAST
                if(dir=='E'){
                    x++;
                }
                //west
               else if(dir=='W'){
                    x--;
                }
                //north
               else if(dir=='N'){
                    y++;
                }
                //south
                else{
                    y--;
                }
            }
            return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
       System.out.println(shortestPath(str)); 
    }
}
