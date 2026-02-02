class Pattern22{

    public static void main(String[] args) {
        int n = 3;
/*
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i>=j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j = 2; j<=n; j++){
                if(i+j>=n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j<=n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j = 2; j<=n; j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
*/
        //Optimised one

        int m = n*2-1;

        for(int i = 1; i <=m; i++){

            for(int j=1; j<=m; j++) {
                int temp = 2*n-i;
                int stars = (i<=n)?i:temp;
                int temp2 = 2*n-1-stars;
                if(j<=stars || j > (temp2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // for(int i = 1; i<=2*n-1; i++){
        //     for(int j=1; j<=2*n-1; j++){
        //         if((i>=j && i<=n)||
        //            (i+j>=2*n && i<=n)||
        //            (i<=j && i>=n)||
        //            (i+j<=2*n && i>=n)
        //           ){
        //               System.out.print("* ");
        //           }else{
        //               System.out.print("  ");
        //           }
        //     }
        //     System.out.println();
        // }
    }
}
