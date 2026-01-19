package com.collection.ScenarioBased.DesignVotingSystem;

class VotingApp {

    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.castVote("Abhishek");
        system.castVote("Raaj");
        system.castVote("Anni");
        system.castVote("Dinesh");
        system.castVote("Rajeev");

        system.showResults();
    }
}
