// https://www.hackerrank.com/challenges/java-vistor-pattern/problem

class SumInLeavesVisitor extends TreeVis {
	private int result;
    
	public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
      	this.result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
	private BigInteger result = new BigInteger("1");
    
	public int getResult() {
        return result.mod(new BigInteger("10").pow(9).add(new BigInteger("7"))).intValue();
    }

    public void visitNode(TreeNode node) {
      	if(node.getColor() == Color.RED)
      		result = result.multiply(new BigInteger(String.valueOf(node.getValue())));
    }

    public void visitLeaf(TreeLeaf leaf) {
      	if(leaf.getColor() == Color.RED)
      		result = result.multiply(new BigInteger(String.valueOf(leaf.getValue())));
    }
}

class FancyVisitor extends TreeVis {
	private int nonLeafEvenDepthResult;
	private int greenLeafResult;
    public int getResult() {
        return Math.abs(nonLeafEvenDepthResult - greenLeafResult);
    }

    public void visitNode(TreeNode node) {
    	if(node.getDepth() % 2 == 0)
    		nonLeafEvenDepthResult += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
    	if(leaf.getColor() == Color.GREEN)
    		greenLeafResult += leaf.getValue();
    }
}

public class Solution {
	private static int n, x[];
	private static Color c[];
	private static HashMap<Integer, HashSet<Integer>> edges;
	
	private static Tree createNode(int index, int depth) {
		HashSet<Integer> children = edges.get(index);
		edges.remove(index);
		
		if(children.isEmpty())
			return new TreeLeaf(x[index-1], c[index-1], depth);
		
		TreeNode node = new TreeNode(x[index-1], c[index-1], depth);
		
		for(Integer childIndex : children) {
			edges.get(childIndex).remove(index);
			node.addChild(createNode(childIndex, depth + 1));
		}
		
		return node;
	}
	
    public static Tree solve() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = new int[n];
        c = new Color[n];
        edges = new HashMap<>(n);
        
        for(int i=0; i<n; i++)
        	x[i] = sc.nextInt();
        for(int i=0; i<n; i++) {
        	int temp = sc.nextInt();
        	if(temp==0)
        		c[i] = Color.RED;
        	else
        		c[i] = Color.GREEN;
        }
        
        for(int i=0; i<n-1; i++) {
        	int v = sc.nextInt();
        	int u = sc.nextInt();
        	HashSet<Integer> vEdges = edges.get(v);
        	if(vEdges == null) {
        		vEdges = new HashSet<>();
        		edges.put(v, vEdges);
        	}
        	vEdges.add(u);
        	HashSet<Integer> uEdges = edges.get(u);
        	if(uEdges == null) {
        		uEdges = new HashSet<>();
        		edges.put(u, uEdges);
        	}
        	uEdges.add(v);
        }
        
        sc.close();
        
        return createNode(1, 0);
    }