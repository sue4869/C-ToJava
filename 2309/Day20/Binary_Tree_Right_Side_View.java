/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);

		while(!q.isEmpty()){
			int val = 0;
			int sz = q.size();

			for(int i = 0; i < sz; i++){
				TreeNode cur = q.poll();
				if(cur == null) break;

				if(i == sz - 1) result.add(cur.val);

				if(cur.left != null) q.add(cur.left);
				if(cur.right != null) q.add(cur.right);
			}
		}

		return result;
	}
}

