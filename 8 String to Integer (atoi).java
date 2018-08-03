class Solution {
    public int myAtoi(String str) {
        int result=0;
        str=str.trim();
        if(str.equals("")){return 0;}
        int neg=1;
        int newResult=0;
        if(str.charAt(0)=='-'){str=str.substring(1,str.length());neg=-1;}
        else if(str.charAt(0)=='+'){str=str.substring(1,str.length());}

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c-'0'<0 || c-'0'>9){break;}
            else{
                newResult=result*10+c-'0';
                if(newResult/10!=result){if(neg==-1){return Integer.MIN_VALUE;}else{return Integer.MAX_VALUE;}}
                else result=newResult;
            }
        }
        return result*neg;
    }
}
