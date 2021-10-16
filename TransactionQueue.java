package Includes;

public class TransactionQueue {

  public Transaction firstTransaction;
  public Transaction lastTransaction;
  public int numTransactions;

  public void AddTransactions (Transaction transaction) {
    //Implement your code here
  }
  
  public Transaction RemoveTransaction () throws EmptyQueueException {
    //Implement your code here
  }

  pulbic int size() {
    //Implement your code here
  }
}
