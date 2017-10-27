# Battle Of Mesoketes

<h2>How to run this program</h2>

<h3> Prerequisite </h3>
Input.txt file having the Test Case data. An example of such file is provided in the repository.

<h3> Steps </h3>

* Step - 1: Clone/Download this repository in Eclipse.
* Step - 2: Right click on "src/com/kshitiz/mesoketes/test/BattleTest.java".
* Step - 3: Go To Run->Run Configurations and give the argument as full path of the Input.txt file on your machine (e.g.      "D:\Input\Input.txt").

<h2> Problem Statement </h2>

You are watching the battle of Mesoketes, that had a big wall that covered the city on all sides. The
wall was built by the Maygans to protect against military incursions from the North. For the
purposes of this problem, the wall is a square. We assume that the builder used a reactive strategy:
whenever a side of the wall was attacked successfully, the Wall on that side would be raised to the
height sufficient to stop an identical attack in the future.
The north border of Mesoketes was frequently attacked by nomadic tribes. For the purposes of this
problem, we assume that each tribe attacks the wall with some strength S and in a direction (the
strength defines the height at impact). In order to repel the attack, the Wall must have height S all
along the defended side of the wall. If the height on that side of the Wall is lower than needed, the
attack will breach the Wall at this point and succeed. Note that even a successful attack does not
damage the Wall. After the attack, every attacked fragment of the Wall that was lower than S is
raised to height S — in other words, the Wall is increased in the minimal way that would have
stopped the attack. Note that if two or more attacks happened on the exact same day, the Wall was
raised only after they all resolved, and is raised in the minimum way that would stop all of them.
Assuming that initially (in 250 BC) the Wall was nonexistent (i.e., of height zero everywhere), and
given the full description of all the nomadic tribes that attacked the Wall, determine how many of
the attacks were successful. Also assume that the city was under attack for a period of 3 days
Input should have the following format;
Day 1; Tribe 1 - Side (N, S, E, W) - Strength : Tribe 2 - Side - Strength : Tribe 3 - Side - Strength
Day 2; Tribe 1 - Side - Strength : Tribe 2 - Side - Strength : Tribe 3 - Side - Strength
Day 3; Tribe 2 - Side - Strength
Output
Number of attacks that succeeded
Test Case 1
Input
Day 1; T1 - N - 3: T2 - S - 4: T3 - W - 2
Day 2: T1 - E - 4; T2 - N - 3: T3 - S - 2
Day 3: T1 - W - 3; T2 - E - 5: T3 - N - 2
Output
6
Test Case 2
Input
Day 1; T1 - S - 4: T1 - N - 2: T3 - W - 3
Day 2: T2 - S - 5; T2 - N - 1: T3 - N - 3
Day 3: T1 - W - 2; T1 - W - 4: T2 - N - 3: T2 - S - 4
Output
6
