package medium;

import java.util.*;

// Given an integer array nums of unique elements, return all possible subsets
// (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.

class Subsets {
    public List<List<Integer>> subsetsHelper(int[] arr, int low, int high) {
		if (low==high) {
			List<List<Integer>> ans = new ArrayList<>();
			List<Integer> t1 = new ArrayList<Integer>();
			List<Integer> t2 = new ArrayList<Integer>();
			t2.add(arr[low]);
			ans.add(t1);
			ans.add(t2);
			return ans;
		}
		List<List<Integer>> smallerProblem = subsetsHelper(arr, low+1, high);
		List<List<Integer>> biggerProblem = new ArrayList<>();
		for (int i=0; i<smallerProblem.size(); i++) {
			List<Integer> curr1 = smallerProblem.get(i);
			biggerProblem.add(curr1);
			List<Integer> curr2 = new ArrayList<Integer>();
			curr2.addAll(curr1);
			curr2.add(arr[low]);
			biggerProblem.add(curr2);
		}
		return biggerProblem;
    }
    public List<List<Integer>> subsets(int[] arr) {
        return subsetsHelper(arr, 0, arr.length-1);
    }
}