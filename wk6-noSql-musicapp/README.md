MongoDB & Java Practice

Design Decisions
At first I was thinking I should separate the song and the user and have them reference each other. However, I thought about what that would mean for the read speed of the database if it contained thousands of users and hundreds of thousands of songs. So I decided I'd try the embedding method to understand a little bit more about how MongoDB leverages this type of design.

SQL or NoSQL?
Being a fan of JavaScript, I'd pick NoSQL over SQL.

What went right?
I was able to create full CRUD for both songs and users.

Challenges?
I realized I should probably spend more time designing a way to have a song collection and a user collection that are more aware of each other if I want the logic of the database to be sound.

Which part did you enjoy working on the most?
I enjoyed looking up the data I created in mongo.
