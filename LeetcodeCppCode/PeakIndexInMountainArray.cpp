#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int st = 0, end = arr.size() - 1;
        

        while(st<=end){
            int mid = st + (end - st) / 2;
            if((arr[mid]>arr[mid + 1]) && (arr[mid]>arr[mid-1])){
                return mid;
            } else if(arr[mid] < arr[mid+1]){
                st = mid + 1;
            } else if(arr[mid] < arr[mid-1]){
                end = mid - 1;
            }
        }

        return -1;
    }
};

int main(){
    Solution s1;
    vector<int> arr = {0,1,0};
    cout<<s1.peakIndexInMountainArray(arr);
    return 0;
}