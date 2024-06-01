The Tower of Hanoi is a classic mathematical puzzle that involves three rods and a number of disks of different sizes which can slide onto any rod. The puzzle starts with the disks neatly stacked in ascending order of size on one rod, the smallest disk at the top. The objective of the puzzle is to move the entire stack to another rod, following these simple rules:

Only one disk can be moved at a time.
Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
No larger disk may be placed on top of a smaller disk.

Algorithm to solve the problem:

1)move n-1 disk from start to mid rod using destination rod
2)move n disk drom start to destination rod
3)move n-1 disk from mid to destination rod
