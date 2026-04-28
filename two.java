class two{
    public static void main(String[] args){
        int n=4;
        for(int row=0;row<n;row++){
            for(int col=n;col>=1;col--){
                if(row<col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }       
    }
}