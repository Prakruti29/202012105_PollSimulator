# 202012105_PollSimulator

Home.jsp - This is the home page which has 4 Links to 1)register candidate 2) to give vote 3) Poll Summary 4) Poll result.

registercandidate.jsp - It is used to registered candidate for voting with their ID and password.

registerationStatus.jsp - It shows whether the candidate is already registered or not.

userVotes.jsp - It allows students to vote for a particular candidate.

Votingstatus.jsp - It shows the student if there vote is successfully casted or not.

pollSummary.jsp - It shows the number of votes each candidate has received.

displayWinner.jsp - It displays the winner of the poll.

src/com/PollSimulator - It has three divisions: 1)Controller: It passes data between the presentation layer and application layer.
It has got the following servlets: 1)UserController 2)VoteController 3)WinnerController
2)Model: It is bean with getter and setter methods.Candidate.java and Student.java are models.
3)Service: It contains the business logic.The Service layers have been created for the classes Candidate And Student.


