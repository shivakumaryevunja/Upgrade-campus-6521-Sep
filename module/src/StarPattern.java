public class StarPattern {
        public static void main(String[] args){
            int num =1;
            int n = 4;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*"+" ");
                    num++;}
                for(int j=n-i;j>=1;j--){
                    System.out.print(" ");
                }
                System.out.print("\n");

            }
            for(int i=n-1;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*"+" ");
                    num++;}

                for(int j=n-i;j>=1;j--){
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }


}
