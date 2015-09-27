/**
 * 
 */
package com.infy.gs;

import junit.framework.TestCase;

/**
 * @author Raj_Kamal02
 *
 */
public class BritishGasTest extends TestCase{
	private BritishGas arrayUtils = new BritishGas();
	
	 public void testFindArrayDoesntExist() {

	        int[] firstArray = {1,2,3,4,5,6,7};
	        int[] secondArray = {8,9,10};

	        int expected = -1;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArrayExistSimple() {

	        int[] firstArray = {1,2,3,4,5,6,7};
	        int[] secondArray = {3,4,5};

	        int expected = 2;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArrayExistFirstPosition() {

	        int[] firstArray = {1,2,3,4,5,6,7};
	        int[] secondArray = {1,2,3};

	        int expected = 0;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArrayExistLastPosition() {

	        int[] firstArray = {1,2,3,4,5,6,7};
	        int[] secondArray = {5,6,7};

	        int expected = 4;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArrayDoesntExistPartiallyEqual() {

	        int[] firstArray = {1,2,3,4,5,6,7};
	        int[] secondArray = {6,7,8};

	        int expected = -1;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArrayExistPartiallyEqual() {

	        int[] firstArray = {1,2,3,1,2,3,4,5,6,7};
	        int[] secondArray = {1,2,3,4};

	        int expected = 3;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArraySubArrayEmpty() {

	        int[] firstArray = {1,2,3,4,5,6,7};
	        int[] secondArray = {};

	        int expected = -1;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArraySubArrayLargerThanArray() {

	        int[] firstArray = {1,2,3,4,5,6,7};
	        int[] secondArray = {4,5,6,7,8,9,10,11};

	        int expected = -1;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	    public void testFindArrayExistsVeryComplex() {

	        int[] firstArray = {1, 6, -3, 7, 23, 67};
	        int[] secondArray = {6, -3, 7};

	        int expected = 1;
	        int actual = arrayUtils.findArrayIndex(firstArray, secondArray);

	        assertEquals(expected, actual);
	    }

	}


