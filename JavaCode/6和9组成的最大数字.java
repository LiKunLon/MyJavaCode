class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        return Integer.valueOf(s.replaceFirst("6","9"));
    }
}