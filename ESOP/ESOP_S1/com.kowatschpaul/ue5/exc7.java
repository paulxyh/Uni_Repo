package com.kowatschpaul.ue5;

public class exc7 {
   static int[] addArrayValues(int[] arr1, int[] arr2){
      if(arr1 != null && arr2 != null && arr1.length == arr2.length){
         int[] arr_Result = new int[arr1.length];
         for(int i = 0; i < arr_Result.length; i++){
            arr_Result[i] = arr1[i] + arr2[i];
         }
         return arr_Result;
      }
      else {
         int[] arr_empty = new int[0];
         return arr_empty;
      }

   }
}
