//package org.example.Problems.FeeCalculator;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//import com.Problems.FeeCalculator.Constant.FILE_TYPE.TRANSACTION_FEE;
//import com.Problems.FeeCalculator.Constant.FILE_TYPE.TRANSACTION_TYPE;
//
//public class FeeCalculator {
//
//    private List<Transaction> transactionList = new ArrayList<>();
//
//	public void addTransaction(Transaction transaction) {
//        transactionList.add(calculateFee(transaction));
//    }
//
//    public void addTransaction(List<Transaction> transactions) {
//        transactions.forEach(this::addTransaction);
//    }
//
//
//    public void displayTransactionReport() {
//        transactionList.sort(Comparator.comparing(Transaction::getClientId)
//                .thenComparing(Transaction::getTransactionType)
//                .thenComparing(Transaction::getTransactionDate)
//                .thenComparing(Transaction::getPriority));
//        System.out.println("Calculated Fees:-");
//        System.out.println("--------------------------------------------------------------------------------");
//        System.out.println("Client Id | Transaction Type | Transaction Date | Priority | Processing Fee    |");
//        for (Transaction transaction : transactionList) {
//            System.out.println("--------------------------------------------------------------------------------");
//            System.out.println(transaction.getClientId() + "\t| " + Utils.getTypeName(transaction.getTransactionType()) + "\t| " +
//                    transaction.getTransactionDate() + "\t| " + (transaction.getPriority() ? "HIGH\t" : "NORMAL") + "\t| " +
//                    transaction.getTransactionFees() + "\t|");
//        }
//        System.out.println("--------------------------------------------------------------------------------");
//    }
//
//
//    private Transaction calculateFee(Transaction transaction) {
//        if (isIntradayTransaction(transaction)) {
//            transaction.setTransactionFees(TRANSACTION_FEE.TEN.getFees());
//        } else {
//            if (transaction.getPriority()) {
//                transaction.setTransactionFees(TRANSACTION_FEE.FIVE_HUNDRED.getFees());
//            } else {
//                if (transaction.getTransactionType() == TRANSACTION_TYPE.SELL.getType() ||
//                        transaction.getTransactionType() == TRANSACTION_TYPE.WITHDRAW.getType()) {
//                    transaction.setTransactionFees(TRANSACTION_FEE.HUNDRED.getFees());
//                } else if (transaction.getTransactionType() == TRANSACTION_TYPE.BUY.getType() ||
//                        transaction.getTransactionType() == TRANSACTION_TYPE.DEPOSIT.getType()) {
//                    transaction.setTransactionFees(TRANSACTION_FEE.FIFTY.getFees());
//                }
//            }
//        }
//        return transaction;
//    }
//
//    private boolean isIntradayTransaction(Transaction other) {
//        boolean isIntraDayTransaction = false;
//        if (transactionList.size() > 0) {
//            for (Transaction transaction : transactionList) {
//                if (transaction.getClientId().equals(other.getClientId()) &&
//                        transaction.getSecurityId().equals(other.getSecurityId()) &&
//                        transaction.getTransactionDate().equals(other.getTransactionDate())) {
//                    if ((transaction.getTransactionType() == TRANSACTION_TYPE.BUY.getType() &&
//                            other.getTransactionType() == TRANSACTION_TYPE.SELL.getType()) ||
//                            (transaction.getTransactionType() == TRANSACTION_TYPE.SELL.getType() &&
//                                    other.getTransactionType() == TRANSACTION_TYPE.BUY.getType())) {
//                        isIntraDayTransaction = true;
//                        transaction.setTransactionFees(TRANSACTION_FEE.TEN.getFees());
//                        break;
//                    }
//                }
//            }
//        }
//        return isIntraDayTransaction;
//    }
//
//}
