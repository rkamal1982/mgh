/**
 * 
 */
package com.infy.gs;

/**
 * @author Raj_Kamal02
 *
 */
public class BritishGas {
	
/**
    * Finds a index of second array in a first array
    * 
    * @param firstArray
    * @param secondArray
    * @return index of second array
    */
   public int findArrayIndex(int[] firstArray, int[] secondArray) {

       /* If any of the arrays is empty then not found */
       if (firstArray.length == 0 || secondArray.length == 0) {
           return -1;
       }

       /* If second array is larger than first array then not found */
       if (secondArray.length > firstArray.length) {
           return -1;
       }

       for (int i = 0; i < firstArray.length; i++) {
           /* Check if the next element of first array is the same as the first element of second array */
           if (firstArray[i] == secondArray[0]) {

               boolean subArrayFound = true;
               for (int j = 0; j < secondArray.length; j++) {
                   /* If outside of large array or elements not equal then leave the loop */
                   if (firstArray.length <= i+j || secondArray[j] != firstArray[i+j]) {
                       subArrayFound = false;
                       break;
                   }
               }

               /* Second array found - return its index */
               if (subArrayFound) {
                   return i;
               }

           }
       }

       /* Return default value */
       return -1;
   }



}
