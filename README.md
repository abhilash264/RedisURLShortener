# URLShortenerRedis
Redis says that:-"Not all query should hit the Database.".
Here is the next back-end configration of URLShortener but using Redis. So Redis is simply a cache library/NOSQL database also referred as an in-memory data storage container where we can use it on top of our SQL/NOSQL primary database rather replacing it as our primary database.
It has some of its pros & cons.
pros:- Faster data access as  the data is present in the Ram itself later being moved to the disk.
cons:- As it is present in the System itself so there is a high chance of data loss whenever the System crashes, the reason why it is not suitable as the primary database.
But It usually depends upon the complexity of the application as some of them still prefer Redis as their Database.
       
