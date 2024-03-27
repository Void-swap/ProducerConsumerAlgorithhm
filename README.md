# Producer-Consumer Algorithm
The Producer-Consumer algorithm synchronizes processes that share a fixed-size buffer. Producers generate data, while consumers retrieve and process it.

## Code Overview
1. Buffer and State Variables:<br>
    - `buffer`: Shared queue for items.<br>
    - `isEmpty`: Empty slots count.<br>
    - `isFull`: Filled slots count.<br>
    - `mutex`: Ensures mutual exclusion.<br>

2. Producer (`producer()`):<br>
    - Acquires mutex.<br>
    - If empty slots, produces an item and updates buffer.<br>
    - Otherwise, prints "Buffer is FULL!!!"<br>

3. Consumer (`consumer()`):<br>
    - Acquires mutex.<br>
    - If filled slots, consumes an item and updates buffer.<br>
    - Otherwise, prints "Buffer is EMPTY!!!"<br>
