class Solution {
    public String defangIPaddr(String address) {
        //java内置方法
        //return address.replace(".","[.]");
        String n="";
        String sum="";
        for(int i=0;i<address.length();i++){
            n=address.substring(i,i+1);
            if(n.equals(".")){
                sum=sum+"[.]";
            }else{
                sum=sum+n;
            }
        }
        return sum;
    }
}