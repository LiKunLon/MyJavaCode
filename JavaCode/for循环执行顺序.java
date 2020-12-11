//A B D C B D C B
    public static void main(String[] args) {
        int i=0;
        for(Out('A');Out('B')&&(i<2);Out('C')){
            i++;
            Out('D');
        }
    }

    public static boolean Out(char c){
        System.out.println(c);
        return true;
    }