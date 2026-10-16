class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < position.length; i++) {
            map.put(position[i], (target - position[i]) * 1.0 /speed[i]);
        }
        Arrays.sort(position);
        int fleet = 1;
        double time = map.get(position[position.length-1]);
        for(int i = position.length - 2; i >= 0; i--) {
            if(map.get(position[i]) > time) {
                fleet++;
                time = map.get(position[i]);
            }
        }
        return fleet;
    }
}
