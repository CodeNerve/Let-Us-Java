// https://leetcode.com/problems/reconstruct-itinerary/


 class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();
        if (tickets == null || tickets.size() == 0) {
            return result;
        }
        int total = tickets.size() + 1;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < tickets.size(); i++) {
            if (map.containsKey(tickets.get(i).get(0))) {
                List<String> tmp = map.get(tickets.get(i).get(0));
                tmp.add(tickets.get(i).get(1));
            } else {
                List<String> tmp = new ArrayList<>();
                tmp.add(tickets.get(i).get(1));
                map.put(tickets.get(i).get(0), tmp);
            }
        }
        for (List<String> list : map.values()) {
            Collections.sort(list);
        }
        result.add("JFK");
        itineraryHelper("JFK", map, result, total, 1);
        return result;
    }

    private boolean itineraryHelper(String current, Map<String, List<String>> map, List<String> result, int total, int num) {
        if (num >= total) {
            return true;
        }
        if (!map.containsKey(current) || map.get(current).size() == 0) {
            return false;
        }
        List<String> curList = map.get(current);
        int i = 0;
        while (i < curList.size()) {
            String next = curList.remove(i);
            result.add(next);
            if (itineraryHelper(next, map, result, total, num + 1)) {
                return true;
            }
            result.remove(result.size() - 1);
            curList.add(i, next);
            i++;
        }
        return false;
    }
}

