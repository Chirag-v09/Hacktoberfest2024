class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        Queue<Integer> queue = new LinkedList<>();
        int indeg[]= new int[numCourses];
        ArrayList<ArrayList<Integer>>  list = buildList(pre,numCourses);
        for(int i=0;i<numCourses;i++)
        {
            for(int it: list.get(i))
                indeg[it]++;
        }
        for(int i=0;i<numCourses;i++)
        {
            if(indeg[i]==0)
                queue.add(i);
        }
        
        int ans[]=new int[numCourses];
        int i=0;
        while(!queue.isEmpty())
        {
            int node = queue.peek();
            queue.remove();
            ans[i++]=node;
            for(int it: list.get(node))
            {
                indeg[it]--;
                if(indeg[it]==0)
                    queue.add(it);
            }
        }
        if(i==numCourses)
            return ans;
        return new int[0];
    }

    public ArrayList<ArrayList<Integer>>  buildList(int [][] pre,int numCourses)
    {
       ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        int m= pre.length;
        for(int i=0;i<m;i++)
        {
            list.get(pre[i][1]).add(pre[i][0]);
        }
        return list;

    }
}