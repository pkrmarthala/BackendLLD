
The PhonePe class is now loosely coupled with generic BankAPI interface.
Our PhonePe Application will have our defined methods for all the functionalities,
in the form of BankAPI interface or abstract class.

The banks will have their own method names.

The bank adapters will be implementing the BankAPI and will be there
to make the functionalities running and make the code changes simple.

In the future, if the bank is changed for some reason, we just need to create the new bank adapter and
make it implement the BankAPI interface.

No need to change all the code base in the future if any new bank comes or existing bank updates something.