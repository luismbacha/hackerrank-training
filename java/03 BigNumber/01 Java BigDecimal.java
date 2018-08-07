// https://www.hackerrank.com/challenges/java-bigdecimal/problem

        for(int i = 0; i < (n - 1); i++) {
           BigDecimal a = new BigDecimal(s[i]);
           //System.out.println("i: " + i);
           for(int j = i+1; j < (n); j++) {
               BigDecimal b = new BigDecimal(s[j]);
               if(a.compareTo(b) == -1) {
                   String aux = s[j];
                   for(int k = j-1; k >= i; k--) {
                       s[k+1] = s[k];
                   }
                   s[i] = aux;
                   a = new BigDecimal(s[i]);
               }
               //System.out.println("j: " + j);
           }
        }