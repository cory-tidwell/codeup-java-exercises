import java.lang.StringBuilder;

class Solution {
    static String toCamelCase(String s){

        // Variables
        String camelCaseString;
        StringBuilder sb = new StringBuilder(s);

        // Algorithm start here

        camelCaseString = sb.toString().replaceAll("[-_]", "");

        return camelCaseString;
    }
}
