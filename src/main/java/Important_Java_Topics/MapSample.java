package Important_Java_Topics;

import java.util.*;

public class MapSample {

    public static void main(String[] args) {
        MapSample ob=new MapSample();
        ob.addToMap();
        ob.extractContentFromMap();
    }

    Map<Integer,String> map=new HashMap<Integer,String>();
    public void addToMap()
    {
        map.put(1,"India");
        map.put(2,"Australia");
        map.put(3,"Pakistan");
        map.put(4,"West Indies");
        System.out.println(map);;
        // to
        System.out.println(map.get(1));

    }


    public void extractContentFromMap() {
        // to get a value by the key.
        System.out.println(map.get(1));

        // to get all vales into collection
        System.out.println(map.values());

        // to get all values into ArrayList
        ArrayList<String> a= new ArrayList<>();
        a.addAll(map.values());
        System.out.println(a);

        // to get all the contents
        Set s= map.entrySet();
        Iterator itr=s.iterator();
        while (itr.hasNext()) {
            Map.Entry me= (Map.Entry) itr.next();
            System.out.println(me.getKey() + "\t" + me.getValue());

        }
    }

}
