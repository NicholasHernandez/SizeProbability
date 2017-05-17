# SizeProbability
Used to calculate probability of using different sizes for hip replacemnet surgery. Used at the begining of the week to order
replacement hips.
Usage:
In sizes.txt put:
#ofPatientsListedBelow
Probability of Patient 1 needing Size 1
Probability of Patient 1 needing Size 2
Probability of Patient 1 needing Size 3
Probability of Patient 1 needing Size 4
Probability of Patient 1 needing Size 5
Probability of Patient 1 needing Size 6
Probability of Patient 1 needing Size 7

Probability of Patient 2 needing Size 1
Probability of Patient 2 needing Size 2
Probability of Patient 2 needing Size 3
Probability of Patient 2 needing Size 4
Probability of Patient 2 needing Size 5
Probability of Patient 2 needing Size 6
Probability of Patient 2 needing Size 7

.
.
.

Probability of Patient n needing Size 1
Probability of Patient n needing Size 2
Probability of Patient n needing Size 3
Probability of Patient n needing Size 4
Probability of Patient n needing Size 5
Probability of Patient n needing Size 6
Probability of Patient n needing Size 7


Example:
4
0.0
0.05
0.2
0.5
0.2
0.05
0.0

0.5
0.3
0.2
0.0
0.0
0.0
0.0

0.05
0.2
0.5
0.2
0.05
0.0
0.0

0.0
0.0
0.05
0.2
0.5
0.2
0.05


After run the jar

it will put the probability of needing mulptiple replacement hips for each size

Example:
Probability 1 size 1 hip is needed
Probability 2 size 1 hip is needed
Probability 3 size 1 hip is needed
Probability 4 size 1 hip is needed

Probability 1 size 2 hip is needed
Probability 2 size 2 hip is needed
Probability 3 size 2 hip is needed
Probability 4 size 2 hip is needed

.
.
.
Probability 1 size 7 hip is needed
Probability 2 size 7 hip is needed
Probability 3 size 7 hip is needed
Probability 4 size 7 hip is needed

Sample output:
0.5
0.025
0.0
0.0

0.389
0.076
0.003
0.0

0.4720000000000001
0.19500000000000006
0.028000000000000004
0.0010000000000000002

0.4800000000000001
0.18000000000000005
0.020000000000000004
0.0

0.495
0.12000000000000001
0.005000000000000001
0.0

0.23
0.010000000000000002
0.0
0.0

0.05
0.0
0.0
0.0

