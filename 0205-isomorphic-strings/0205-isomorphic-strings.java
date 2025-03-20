class Solution {
    public boolean isIsomorphic(String s, String t) {


        int map1[] = new int[256];
        int map2[] = new int[256];

        for(int i=0; i<s.length(); i++){
            if(map1[s.charAt(i)] != map2[t.charAt(i)]) return false;

            map1[s.charAt(i)] =i+1;
        
            map2[t.charAt(i)] =i+1;
        }
        // for(int i=0; i<map1.length; i++){
        //     System.out.print(map1[i]+" ");
        // }System.out.println();
        // for(int i=0; i<map2.length; i++){
        //     System.out.print(map2[i]+" ");
        // }
        return true;
    }
}

// "papap"
// "titii"