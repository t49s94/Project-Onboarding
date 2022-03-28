/*
100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers.
Next, he closes every second locker. Then, on his third pass, he toggles every third locker (closes
it if it is open or opens it if it is closed). This process continues for 100 passes, such that on
each pass 'i', the man toggles every 'i'th locker. After his 100th pass in the hallway, in which he
toggles only locker #100, how many lockers are open?
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        int numberOpenLockers = getNumberOpenLockers(100);
        System.out.println("Number of open lockers: " + numberOpenLockers);

    }

    public static int getNumberOpenLockers(int numLockers) {

        boolean[] lockers = new boolean[numLockers];

        for(int i = 1; i <= numLockers; i++) {
            int lockerIdx = i;
            // increases by one every pass
            int toggleIteration = 1;

            // controls that locker index doesn't go over array size
            while(lockerIdx <= numLockers) {
                // toggles locker
                lockers[lockerIdx-1] = !lockers[lockerIdx-1];
                toggleIteration++;
                lockerIdx = i * toggleIteration;
            }
        }

        int numOpenLockers = 0;

        for(int i = 0; i < numLockers; i++) {
            if(lockers[i])
                numOpenLockers++;
        }

        return numOpenLockers;
    }
}
