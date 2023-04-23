class P4{
    int n = 10,a=0;
    void sum(){
        for(int i=0;i<=n; i++){
            if(i !=0 ){
                a+=i;
            }
        }
        System.out.println("Sum of Natural No: "+a);
    }
    public static void main(String args[]){
        P4 o = new P4();
        o.sum();
    }
}