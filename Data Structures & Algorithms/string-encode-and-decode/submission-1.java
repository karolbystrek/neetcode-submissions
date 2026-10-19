class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        strs.forEach(str -> {
            builder.append("#")
                    .append(str.length())
                    .append("#")
                    .append(str);
        });
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                while (str.charAt(++i) != '#') {
                    builder.append(str.charAt(i));
                }
                int strSize = Integer.valueOf(builder.toString());
                builder.setLength(0);
                while (strSize-- > 0) {
                    builder.append(str.charAt(++i));
                }
                result.add(builder.toString());
                builder.setLength(0);
            }
        }
        return result;
    }
}
