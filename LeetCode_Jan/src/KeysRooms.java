//0119
//841. Keys and Rooms

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //start from room 0 and stop at destination
        //check whether length of the path == roomNum

        int roomNum = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        q.offer(0);
        visited.add(0); //start at room 0

        while (!q.isEmpty()) {
            int key = q.poll();
            if (!visited.contains(key)) {
                visited.add(key);
            }
            for (int j = 0; j < rooms.get(key).size(); j++) {
                int curRoom = rooms.get(key).get(j);
                if (!visited.contains(curRoom)) {
                    q.offer(curRoom);
                    visited.add(curRoom);
                }
            }
        }
        return roomNum == visited.size();






//        for (int i = 0; i < roomNum; i++) {
//            for (int j = 0; j < rooms.get(i).size(); j++) {
//                int curRoom = rooms.get(i).get(j);
//                if (!visited.contains(curRoom)) {
//                    q.offer(curRoom);
//                    visited.add(curRoom);
//                }
//            }
//        }


//        return true;
    }
}
