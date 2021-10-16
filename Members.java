package Includes;

public class Members
 {

  public String UID;
  public List<Pair<String, TransactionBlock>> mycoins;
  public Transaction[] in_process_trans;

  public void initiateCoinsend(String destUID, DSCoin_Honest DSobj) {
    //implement your code here
  }

  public Pair<List<Pair<String, String>>, TransactionBlock> finalizeCoinsend (Transaction tobj, DSCoin_Honest DSObj) {
    //implement your code here
  }

  public void recieveCoin(List<Pair<String, String>> scpr, TransactionBlock block) {
    //implement your code here
  }

  public void MineCoin(DSCoin_Honest DSObj) {
    //implement your code here
  }  
}
