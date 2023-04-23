class P1{
    int n;
    void natural(){
        for (int i = 0; i <= 10; i++){
            if(i !=0 ){
                System.out.println("Natural NO: "+i);
            }
            else{
                System.out.println("Not Natural No: "+i);
            }
        }
    } 
    public static void main(String args[]){
        P1 o = new P1();
        o.natural(); 
    }
}