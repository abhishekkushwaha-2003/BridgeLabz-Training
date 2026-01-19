package com.collection.ScenarioBased.ImplementBankingSystem;
import java.util.LinkedList;
import java.util.Queue;

// This class processes withdrawal requests using a queue
class WithdrawalQueueProcessor {

    private Queue<WithdrawalRequest> queue = new LinkedList<>();
    private AccountStore store;

    WithdrawalQueueProcessor(AccountStore store) {
        this.store = store;
    }

    // Add withdrawal request to queue
    void addRequest(WithdrawalRequest request) {
        queue.add(request);
    }

    // Process all withdrawal requests
    void processRequests() {

        while (!queue.isEmpty()) {

            WithdrawalRequest request = queue.remove();
            int currentBalance = store.getBalance(request.accountNumber);

            if (currentBalance >= request.amount) {
                store.updateBalance(
                        request.accountNumber,
                        currentBalance - request.amount
                );
                System.out.println("Withdrawal successful for Account "
                        + request.accountNumber);
            } else {
                System.out.println("Insufficient balance for Account "
                        + request.accountNumber);
            }
        }
    }
}
