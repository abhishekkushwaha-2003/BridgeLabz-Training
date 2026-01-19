package com.collection.ScenarioBased.DesignVotingSystem;

//Main voting system class
class VotingSystem {

 private VoteStorage storage = new VoteStorage();
 private VoteOrderTracker tracker = new VoteOrderTracker();
 private ResultDisplay display = new ResultDisplay();

 // Cast a vote
 void castVote(String candidate) {

     tracker.recordVote(candidate);
     storage.addVote(candidate);
 }

 // Show all details
 void showResults() {

     tracker.displayVoteOrder();
     display.displaySortedResult(storage.getVoteCount());
 }
}
