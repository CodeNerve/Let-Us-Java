import java.util.*;

public class Hashing{
//(There is no guarantee that the elements will get out in a particular sequence in Hashset and Hashmap.)
//    Key-->Unique, Value-->maybe unique.
//    Hashset:-
//    public static void main(String []args){
//        //Creating:-
//        HashSet<Integer> set = new HashSet<>();
//        //Insert:-
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        //Search- contains:-
//        if(set.contains(1)){
//            System.out.println("set contains 1.");
//        }
//        if(!set.contains(6)){
//            System.out.println("Does not contain.");
//        }
//        //Removing:-
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("set doesn't contains 1");
//        }
//        //Size:-
//        System.out.println("Size of set is-->"+set.size());
//
//        //Print all elements:-
//        System.out.println(set);
//
//        //Iterator:-
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//
//    }

    //    Hashmap:-
    public static void main(String []args){
        //country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion:-
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        //Key's value will get updated if we input another value of the same key.
        //Else a new key will be created.
        map.put("China",180);
        System.out.println(map);

        //Search:-
        if(map.containsKey("China")){
            System.out.println("Key present.");
        }
        else{
            System.out.println("Key not present.");
        }
        System.out.println(map.get("China")); //180
        System.out.println(map.get("Indonesia")); //null

        //Another way to use a for loop:-
//    int []arr = {1,2,3};
//    for(int i : arr){
//        System.out.print(i+" ");
//    }
        //Traversing the map:-
        for(Map.Entry<String, Integer> e :map.entrySet()){
            System.out.print(e.getKey()+":"+ e.getValue()+" ");
        }
        System.out.println();
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+ map.get(key));
        }
        //Removing pair:-
        map.remove("China");
        System.out.println(map);
    }
}

