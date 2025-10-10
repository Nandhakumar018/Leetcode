class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder answer=new StringBuilder();
        for (int w=0;w<words.length;w++) {
            StringBuilder word=new StringBuilder(words[w]);
            answer.append(word.reverse());
            if (w<words.length-1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}