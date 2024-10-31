class Solution {
public:
bool binarySearchRow(vector<int>& matrix, int target){
        
       int j = matrix.size()-1;
       int i = 0;
        cout<<i<<endl;
       while(i<=j){
        // cout<<l<<" "<<k<<endl;
            int mid = (i+j)/2;
            if(matrix[mid] == target) return 1;
            else if(matrix[mid]<target) i = mid+1;
            else  j = mid-1;

       }

       return 0;
    }

    bool searchMatrix(vector<vector<int>>& matrix, int target) {
         int i = 0, j=matrix.size()-1;
        int n = matrix[0].size();
        // cout<<i<<" size-> "<<j<<endl;
         bool possible = 0;
        while(i<=j){
           
           
            if(matrix[i][0]<=target && matrix[i][n-1]>=target){
                possible|= (binarySearchRow(matrix[i],target));
                
            }
            else if(matrix[i][0]>target) break;
            i++;
           
            //  cout<<i<<" "<<j<<endl;
        }
       
        return possible;
    }
};
