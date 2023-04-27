package stringSearching;

public class KMPAlgorithm {
    public static int[] buildKMPTable(String needle) {
        int[] result = new int[needle.length()];
        result[0] = 0;
        int l=0;
        int r=1;
        while(r < needle.length() && l < needle.length()) {
            if (needle.charAt(l) == needle.charAt(r)) {
                l++;
                result[r] = l;
                r++;
            } else {
                if (l > 0) {
                    l = result[l-1];
                } else {
                    result[r] = 0;
                    r++;
                }
            }
        }
        return result;
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }


        int[] kmpTable = buildKMPTable(needle);
        int needle_index = 0;


        for(int i=0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needle_index)) {
                needle_index++;
            } else {
                if (needle_index != 0) {
                    needle_index = kmpTable[needle_index-1];
                    i--;
                }
            }


            if (needle_index == needle.length()) {
                return i - needle_index + 1;
            }
        }
        return -1;
    }


}
