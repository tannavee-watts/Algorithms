    public String longestPalindrome(String s) {
        int n=s.length();
        
        boolean table[][]=new boolean[n][n];
        
        for(int i=0;i<n;++i)
            table[i][i]=true;
         
        int start=0;
        int maxLen=1;
        for(int i=0;i<n-1;++i)
            if(s.charAt(i)==s.charAt(i+1))
            {
                table[i][i+1]=true;
                maxLen=2;
                start=i;
            }
        
        for(int k=3;k<=n;++k){
            for(int i=0;i<n-k+1;++i)
            {
                int j=i+k-1;
                
                if(table[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    table[i][j]=true;
                    start=i;
                    maxLen=k;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
