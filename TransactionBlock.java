package Includes;

public class TransactionQueue {

  public Transaction[] trarray;
  public TransactionBlock previous;
  public MerkleTree Tree;
  public String trsummary;
  public String nonce;
  public String dgst;

  public boolean checkTransaction (Transaction[] t, BlockChain bChain) {
    //Implement your code here
  }
  
  public TransactionBlock FindLongestChain (BlockChain_Malicious bChain) {
    //Implement your code here
  }

  
  public void createBlock (Transaction[] t, dgst prev_dgst) {
    //Implement your code here
  }

  pulbic int size() {
    //Implement your code here
  }
}
