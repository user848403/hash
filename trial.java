import java.util.*;
class Trial {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); //creation
        map.put("Riya", 50);  //insertion
        map.put("Ritika", 100);
        map.put("Rika", 200);
        map.put("Ritik", 230);
       System.out.println(map);  //print the map
        if(map.containsKey("Riya")){
            System.out.println(map.get("Riya")); //prints value of Riya
        }
        for(Map.Entry<String,Integer>e:map.entrySet()){  //iterate through map
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        map.remove("Riya");
        System.out.println(map);  //prints map with removed value
    }
}
/*OUTPUT:
{Riya=50, Ritika=100, Ritik=230, Rika=200}
        50
Riya
50
Ritika
100
Ritik
230
Rika
200
        {Ritika=100, Ritik=230, Rika=200}
*/