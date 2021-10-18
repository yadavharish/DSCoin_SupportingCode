import Includes.*;
import java.util.*;

public class MerkleTree{

	// Check the TreeNode.java file for more details
	public TreeNode rootnode;
	public int numdocs;
	void nodeinit(TreeNode node,TreeNode l,TreeNode r,TreeNode p,String val)
	{
		node.left = l;
		node.right = r;
		node.parent = p;
		node.val = val;
	}

	public String get_str(Transaction tr)
	{
		String val = tr.coinID;
		if(tr.Source==null)
		val = val + "#" + "Moderator";
		else
		val = val + "#" + tr.Source.UID;

		val = val + "#" + tr.Destination.UID;

		if(tr.coin_source==null)
		val = val + "#" + "Moderator";
		else
		val = val + "#" + tr.coinsrc_block.dgst;

		return val;
	}
	public String Build(Transaction[] tr){

			CRF obj = new CRF(64);
			int num_trans = tr.length;
			List<TreeNode> q = new ArrayList<TreeNode>();
			for(int i=0;i<num_trans;i++)
			{
				TreeNode nd = new TreeNode();
				String val = get_str(tr[i]);
				nodeinit(nd,null,null,null,val);
				q.add(nd);
			}
			TreeNode l,r;
			while(q.size()>1)
			{
				l = q.get(0);
        q.remove(0);
				r = q.get(0);
        q.remove(0);
				TreeNode nd = new TreeNode();
				String l_val = get_str(l);
				String r_val = get_str(r);
				String data = obj.Fn(l_val+"#"+r_val);
				nodeinit(nd,l,r,null,data);
				l.parent = nd;
				r.parent = nd;
				q.add(nd);
			}
			rootnode = q.get(0);

		return rootnode.val;


	}

}
