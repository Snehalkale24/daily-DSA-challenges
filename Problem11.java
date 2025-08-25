import java.util.*;

public class Problem11 {
    
    public static List<String> permuteUnique(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); 
        boolean[] used = new boolean[chars.length];
        backtrack(chars, new StringBuilder(), used, result);
        return result;
    }

    private static void backtrack(char[] chars, StringBuilder path, boolean[] used, List<String> result) {
        if (path.length() == chars.length) {
            result.add(path.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            path.append(chars[i]);

            backtrack(chars, path, used, result);
            used[i] = false;
            path.deleteCharAt(path.length() - 1);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = permuteUnique(s);
        System.out.println(permutations);
    }
}
