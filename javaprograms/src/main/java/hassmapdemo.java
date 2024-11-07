import java.util.HashMap;

public class hassmapdemo {
    public static void main(String[] args) {

        HashMap<String, Integer> myfriend = new HashMap<>();
        //adding friend name with age
        myfriend.put("wani", 5);
        myfriend.put("anjali", 28);
        myfriend.put("harsh", 21);
        myfriend.put("priyal", 19);
        //we write this here to update the value so that we can change the value
        myfriend.put("harsh", 20);
        System.out.println(myfriend);

        for (String name : myfriend.keySet()) {
            System.out.println(name);
        }
        for (int age : myfriend.values())
            System.out.println(age);
        {
            //to acees the specific value from the hashmap
            System.out.println(myfriend.get("wani"));
        }


    }
}
