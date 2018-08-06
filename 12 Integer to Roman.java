class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        if(num/1000>0){
            for(int i=0;i<num/1000;i++){
                str.append("M");
            }
         num=num%1000;
        }
        if(num>=100){
            str.append(cal("M","D","C",num,100));
            num=num%100;
        }
        if(num>=10){
            str.append(cal("C","L","X",num,10));
            num=num%10;
        }
        if(num==9){str.append("IX");num=num-9;}
        else if(num>=5){str.append("V");num=num-5;}
        else if(num==4){str.append("IV");num=num-4;}
        for(int i=0;i<num;i++){
            str.append("I");
        }
        return str.toString();

        


        
    }
    public String cal(String ten, String five, String one, int num, int carry){
        StringBuilder s = new StringBuilder();
        if(num>=9*carry){
            return one+ten;
        }
        else if(num>=5*carry){
            num=(num-5*carry)/carry;
            s.append(five);
            for(int i=0;i<num;i++){
                s.append(one);
            }
            return s.toString();
        }
        else if(num>=4*carry){
            return one+five;
        }else{
            for(int i=0;i<num/carry;i++){
                s.append(one);
            }
            return s.toString();
        }
    }
}
