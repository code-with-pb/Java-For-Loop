class P2{
    int n = 10;
    void nat(){
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        P2 o = new P2();
        o.nat();
    } 
}