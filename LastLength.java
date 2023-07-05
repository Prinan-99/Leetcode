class Solution {
    public int lengthOfLastWord(String s) {
     String D[]=s.split(" ");
     int i=D.length;
     int l=D[i-1].length();
     return l;

    }
}