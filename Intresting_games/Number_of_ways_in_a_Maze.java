package Practice;
public class Number_of_ways_in_a_Maze {
    public static int num_of_ways(int row, int col){
        if(row==1||col==1){
            return 1;
        }
        return num_of_ways(row-1,col)+num_of_ways(row,col-1);
    }
    public static void main(String []args){
        System.out.println(num_of_ways(3,3));
    }
}