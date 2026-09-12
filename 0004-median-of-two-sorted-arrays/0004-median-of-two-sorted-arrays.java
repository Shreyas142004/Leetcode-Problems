class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr=new int[m+n];
        int j=0,i=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            arr[k++]=nums1[i++];
        }
        while(j<n){
            arr[k++]=nums2[j++];
        }
        double med;
        int val;
        int size=n+m;
        if(size%2!=0){
            val=(m+n)/2;
            med=arr[val];
        }else{
            val=(m+n)/2;
            med=(double)(arr[val]+arr[val-1])/2;
        }
        return med;
    }
}