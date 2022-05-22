class Solution {
    static public String thousand(Integer num)
    {
        String ret = "";
        if (num >= 1000)
        {
            var idx = num / 1000;
            while (idx != 0)
            {
                ret += 'M';
                idx--;
            }
        }
        return ret;
    }
    static public String hundred(int sum)
    {
        String ret = "";
        if (sum >= 100)
        {
            var idx =  sum / 100;
            if(idx > 5)
            {
                if(idx == 9)
                    return "CM";
                ret += "D";
                while(idx - 5 != 0)
                {
                    ret += "C";
                    idx --;
                }
            }
            else if (idx < 5)
            {
                if(idx == 4)
                    return "CD";
                while(idx != 0)
                {
                    ret += "C";
                    idx --;
                }
            }
            else return "D";
        }
        return ret;
    }
    static public String tenth(int num)
    {
        String ret = "";
        if (num >= 10)
        {
            var idx =  num / 10;
            if(idx > 5)
            {
                if(idx == 9)
                    return "XC";
                ret += "L";
                while(idx - 5 != 0)
                {
                    ret += "X";
                    idx --;
                }
            }
            else if (idx < 5)
            {
                if(idx == 4)
                    return "XL";
                while(idx != 0)
                {
                    ret += "X";
                    idx --;
                }
            }
            else return "L";
        }
        return ret;
    }
    static  public String unit(int num)
    {
        String ret = "";
        if (num >= 1)
        {
            var idx =  num ;
            if(idx > 5)
            {
                if(idx == 9)
                    return "IX";
                ret += "V";
                while(idx - 5 != 0)
                {
                    ret += "I";
                    idx --;
                }
            }
            else if (idx < 5)
            {
                if(idx == 4)
                    return "IV";
                while(idx != 0)
                {
                    ret += "I";
                    idx --;
                }
            }
            else return "V";
        }
        return ret;
    }
    static public String intToRoman(int num) {
        String ret = "";
        ret += thousand(num);
        num  = num % 1000;
        ret += hundred(num);
        num = num % 100;
        ret += tenth(num);
        num = num % 10;
        ret += unit(num);
        return ret;
    }
}