class Solution {
    public int candy(int[] ratings) {
        int total =0;
        int candy[]=new int[ratings.length];
        for(int i=0;i<candy.length;i++)
            candy[i]=1;
        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i]>ratings[i-1])
                candy[i]=candy[i-1]+1;
        }
        for(int i=ratings.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1] && candy[i+1]>=candy[i])
                candy[i]=candy[i+1]+1;
        }
        for(int i=0;i<candy.length;i++)
        {
            total+=candy[i];
        }
        return total;
    }
}