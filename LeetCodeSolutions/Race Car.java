//  https://leetcode.com/problems/race-car/


class Solution {
      public int racecar(int target) {
        Set<String> visited = new HashSet<>(); 
        Queue<StateNode> queue = new LinkedList<>();
        queue.add(new StateNode(1, 0));
        int distance = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                StateNode cur = queue.poll();
                if (cur.position == target) {
                    return distance;
                }
                // if A
                int nextPosition = cur.position + cur.speed;
                int nextSpeed = cur.speed * 2;
                if (!visited.contains(nextSpeed + "," + nextPosition) && Math.abs(target - nextPosition) < target) {
                    visited.add(nextSpeed + "," + nextPosition);
                    queue.offer(new StateNode(nextSpeed, nextPosition));
                }             
                // if R
                nextPosition = cur.position;
                nextSpeed = cur.speed > 0 ? -1 : 1;
                if (!visited.contains(nextSpeed + "," + nextPosition) && Math.abs(target - nextPosition) < target) {
                    visited.add(nextSpeed + "," + nextPosition);
                    queue.offer(new StateNode(nextSpeed, nextPosition));
                }
            }
            distance++;
        }
        return -1;
    }

    class StateNode {
        int speed;
        int position;

        public StateNode(int speed, int position) {
            this.speed = speed;
            this.position = position;
        }
    }
}
