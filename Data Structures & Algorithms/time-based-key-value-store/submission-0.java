class TimeMap {
    HashMap<String, List<Integer>> times;
    HashMap<String, List<String>> values;

    public TimeMap() {
        times = new HashMap<>();
        values = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        times.putIfAbsent(key, new ArrayList<>());
        values.putIfAbsent(key, new ArrayList<>());

        times.get(key).add(timestamp);
        values.get(key).add(value);
    }

    public String get(String key, int timestamp) {
        if (!times.containsKey(key)) {
            return "";
        }

        List<Integer> t = times.get(key);
        List<String> v = values.get(key);

        int s = 0;
        int e = t.size() - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (t.get(mid) <= timestamp) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans == -1 ? "" : v.get(ans);
    }
}
