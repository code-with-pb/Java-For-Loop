class P3{
    char ch = 'z';
    void alpha(){
        for(char i = 'a'; i <= ch; i++){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        P3 o = new P3();
        o.alpha();
    }
}