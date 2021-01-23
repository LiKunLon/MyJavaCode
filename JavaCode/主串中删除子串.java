//删除第一个字符串中出现的第二个字符串的自字符
    /**
     * 例如:
     * String str1="welcome to bit";
     * String str2="come";
     * 输出:"wl t bit";
     */
    public static List<Character> func(String str1, String str2){
        List<Character> list=new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            //遍历第一个字符串;
            //第二个字符串里没有;就添加给list
            if(!str2.contains(ch+"")){
                list.add(ch);
            }
        }
        return list;
    }
    public static String func2(String str1,String str2){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(!str2.contains(ch+"")){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1="welcome to bit";
        String str2="come";
        System.out.println(func(str1, str2));
        System.out.println(func2(str1, str2));
    }