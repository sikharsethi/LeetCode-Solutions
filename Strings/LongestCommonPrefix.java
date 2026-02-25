package Strings;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        //Take first string as initial prefix
        String prefix = strs[0];

        //compare with each subsequent string
        for(int i =0; i < strs.length; i++) {

            //keep reducing prefix until it matches start of current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
                    if(prefix.isEmpty()) {
                        return "";
                    }
            }

        }
        return prefix;
    }

}