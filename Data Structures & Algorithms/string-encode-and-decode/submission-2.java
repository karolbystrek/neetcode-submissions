class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        strs.forEach(str -> {
            builder.append(str.length())
                    .append("#")
                    .append(str);
        });
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new LinkedList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);
            int length = Integer.valueOf(str.substring(i, delimiter));
            i = delimiter + 1;
            String value = str.substring(i, i + length);
            result.add(value);
            i = i + length;
        }
        return result;
    }
}
