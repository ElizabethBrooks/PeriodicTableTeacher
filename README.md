# PeriodicTableTeacher
Java application for learning the elements of the periodic table, their atomic weights, and their molecular structures.

This program will be able to determine from user input the element the user would like to know the ground state electronic configuration of.
This program will output the atomic number of the specified element followed by the ground state electronic configuration for that element (based on its atomic number).
The ground state electronic configuration will be given in noble gas shorthand.
However, the configuration is given based on the groupings in the periodic table, not on the energy levels of the shells (1s<2s<2p<3s<3p<4s<3d<4p<5s<4d<5p<6s<4f<5d<6p<7s<5f<6d<7p).

There is also a bonus element quiz at the end of this program.
The quiz will randomly generate an atomic number, then the user will input what element they think has that atomic number.
The program will then check their answer against the hash map of elements to verify if their answer is correct or not.
Finally, the program will write to a file the answer of the user, then output the quiz results of the user by reading from that file and printing to the screen.
