
The PhonePe class is tightly coupled with YesBankAPI in every function.
In the future, if the bank is changed for some reason, we need to change
    1. the API object creation here
    2. the object that is passed to and received in all the functions
    3. the getBalance() method to the function that will be available in that new bankAPI

To change something in the future lot of code base need to be modified.