class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        if(restrictions.length == 0){
            return n-1;
        }

        List<int []> temp = new ArrayList<>();
        temp.add(new int[]{1,0});
        for(int []arr: restrictions){
            temp.add(arr);
        }

        boolean found = false;
        for(int arr[]: restrictions){
            if(arr[0]==n){
                found = true;
                break;
            }
        }

        if(!found){
            temp.add(new int[]{n,n-1});
        }
        temp.sort((a,b)-> a[0]-b[0]);
        int m = temp.size();

        //for left to right storing
        for(int i=1; i<m; i++){
            int dist = temp.get(i)[0] - temp.get(i-1)[0];
            temp.get(i)[1] = Math.min(temp.get(i)[1], temp.get(i-1)[1]+dist);
        }

        //for right to left storing
        for(int i=m-2; i>=0; i--){
            int dist = temp.get(i+1)[0] - temp.get(i)[0];
            temp.get(i)[1] = Math.min(temp.get(i)[1], temp.get(i+1)[1]+dist); 
        }

        long highestBuilding = 0;
        for(int i=1; i<m; i++){
            long x1 = temp.get(i-1)[0];
            long h1 = temp.get(i-1)[1];

            long x2 = temp.get(i)[0];
            long h2 = temp.get(i)[1];

            long dist = x2-x1;
            long peak = (h1 + h2 + dist)/2;
            highestBuilding = Math.max(highestBuilding, peak);
        }

        return (int)highestBuilding;
    }
}