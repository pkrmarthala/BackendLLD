Observer Design Pattern has one Provider and one or more Subscriber(s).

Provider should have the methods for
1. registering
2. de-registering and
3. notifying the subscriber

Consumer or the Subscriber should have methods for getting himself
1. registered
2. de-registered and
3. updated from the providers

Whenever there is update with the provider, it will call all of its subscribers to get that update.

Note:
The provider will not cater to the individual requirements of the observers.
The observer can get the updates from the provider and process those as and how they need it.