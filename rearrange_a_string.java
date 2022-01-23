class Solution
{
    char[] sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        return arr;
        //System.out.print(String.valueOf(arr));
    }
    
    public String arrangeString(String s)
    {
        String res = String.valueOf(sortString(s));
        String num = res.replaceAll("([A-Z])", "");
        res = res.replaceAll("([0-9])", "");
        int total = 0;
        for(int i=0; i < num.length(); i++) {
            total += Character.getNumericValue(num.charAt(i));
        }
        return res.concat(Integer.toString(total));
    }
}
