9 Best Practices to implement in REST API development
--

###1. Use JSON

REST allows using different output formats, like plain text, JSON, CSV, XML, RSS, or even HTML. For sure this may depend on the application you have and specifically on what you need your API for. If you have a public-facing service which you want to be accessible through REST API almost in 99% of cases you should choose JSON as the data format used in the communication, both the payload and the response.

###2. Use Nouns instead of Verbs

> Correct way
>
> - GET /books/123
> - DELETE /books/123
> - POST /books
> - PUT /books/123
> - PATCH /books/123
>
 __-vs-__
 
> Incorrect way
>- GET /addBook123 (by the way, GET should be only used to READ data and never to change its state in any way)
>- GET /DeleteBooks/123
>- POST /DeleteAllBooks
>- POST /books/123/delete


###3. Name the collections using Plural Nouns
For the collections in REST API development use plural nouns. It is not just an established good practice. It actually makes it easier for humans to get an idea that something is actually a collection.

>Eg. 
>- GET  /cars/123
>- POST /cars
>- GET /cars

>-vs-
 
>- GET /car/123
>- POST /car
>- GET /car


###4. Use resource nesting to show relations or hierarchy

Resource objects often have some kind of functional hierarchy or are related to each other. For example in the online store, we have ‘users’ and ‘orders’. Orders always belong to some user, therefore we may have the following endpoints structure laid out:

>- /users <- user’s list
>- /users/123 <- specific user
>- /users/123/orders <- orders list that belongs to a specific user
>- /users/123/orders/0001 <- specific order of a specific user

###5. Error Handling

In many cases, at least correct handling of the HTTP statuses is enough, but it is even better to provide more verbose messages and some internal code reference for even more detailed explanation. So the “perfect” error message would consist of:

>- HTTP Status Code
>- Code ID - which may be an internal reference, you may also provide a link to the API documentation containing all the code id’s
>- Human readable message shortly explaining the error (its cause, context or possible remedy)


###6. Filtering, sorting, paging, and field selection
Few of the most important features for consuming an API are filtering, sorting and paging. Resource collections are oftentimes enormous, and when some data has to be retrieved from them, it would be simply not very efficient to always get the full list and browse it for specific items. Therefore we can use:

Filtering - to narrow down the query results by specific parameters, eg. creation date, or country
Sorting - basically allows sorting the results ascending or descending by a chosen parameter or parameters, eg. by date
Paging - uses “limit” in order to narrow down the number of results shown to a specific number, and “offset” to specify which part of the results range to be shown - this is important in cases where the number of total results is greater than the one  presented, this works like pagination you may encounter on many websites 


###7. Versioning
Examples of endpoint URI versioning:

>- https://us6.api.mailchimp.com/3.0/ (major + minor version indication)
>- https://api.stripe.com/v1/ (major version indication only)
>- https://developer.github.com/v3/  (major version indication only)
>- https://api.twilio.com/2010-04-01/ (date based indication)


###8. API Documentation
It is extremely important to have API documentation published. Not only developers like to know what they are dealing with when making an integration, but this also allows potential users to see what is made available via your API. 




###9. Using SSL/TLS
Always use SSL/TLS to encrypt the communication with your API. No exceptions. Period
 


 
