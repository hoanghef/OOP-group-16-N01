import java.util.HashMap;

public class HashCollisionTest {

    public static void checkForCollisions(String[] data) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        int collisionCount = 0;

        for (String item : data) {
            int hashValue = item.hashCode(); 

            if (hashMap.containsKey(hashValue)) {
                collisionCount++;
                System.out.println("Collision detected!");
                System.out.println("Item: " + item + " has the same hash as: " + hashMap.get(hashValue));
            } else {
                hashMap.put(hashValue, item); 
            }
        }

        System.out.println("Total collisions: " + collisionCount);
    }

    public static void main(String[] args) {
        String[] testData = {
                "apple",
                "banana",
                "carrot",
                "banana", 
                "orange",
                "grape",
                "pear",
                "carrot"  
        };

        checkForCollisions(testData);
    }
}
