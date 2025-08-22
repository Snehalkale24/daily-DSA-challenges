public class Problem8 {
    public static String reverseWords(String s) {
       
        s = s.trim();
        String[] words = s.split("\\s+");

     
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" "); 
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "the sky is blue";
        String output = reverseWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
