public class FirstUniqueLetter
{
    public static int uniqueLetter(String s) {
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            freq[curr-'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(freq[curr-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(uniqueLetter(s));
	}
}
