package easy.q88;

public class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] result = new int[m+n];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(j!=m && k!=n){
//            if(nums1[j] < nums2[k]) {
//                result[i] = nums1[j];
//                j++;
//            } else{
//                result[i] = nums2[k];
//                k++;
//            }
//            i++;
//        }
//        while(j<m){
//            result[i] = nums1[j];
//            i++;
//            j++;
//        }
//        while(k<n){
//            result[i] = nums2[k];
//            i++;
//            k++;
//        }
//
//        for (int index=0; index<(m+n); index++) {
//            nums1[index] = result[index];
//        }
//    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(j!=m || k!=n) {
            if (j == m) {
                result[i] = nums2[k];
                k++;
            } else if (k == n) {
                result[i] = nums1[j];
                j++;
            } else if(nums1[j] < nums2[k]) {
                result[i] = nums1[j];
                j++;
            } else{
                result[i] = nums2[k];
                k++;
            }
            i++;
        }

        for (int index=0; index<(m+n); index++) {
            nums1[index] = result[index];
        }
    }
}
