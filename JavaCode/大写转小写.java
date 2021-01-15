//大写转小写字母
    public static void main(String[] args) {

        System.out.println(toLowerCase("ABCD"));
    }
    public static String toLowerCase(String str){
        if(str==null||str.length()==0){
            return str;
        }
        //利用toCharArray方法把字符串转化成字符数组
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]>='A'&&ch[i]<='Z'){
                ch[i]+=32;
            }
        }
        return String.valueOf(ch);
    }