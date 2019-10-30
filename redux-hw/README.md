---
Title: Redux Basics
Type: Homework
Duration: "1:30"
Creator: Melissa Arliss
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Redux Basics

## Introduction 

Redux gives us neat tools and benefits, some of which we'll introduce in class and many others we won't be able to get to and will be left to you to explore.  Create a `.js` file to write your solution code.

----

## Assignment

### Part 1: Redux Reinforcement

Watch at least the first five videos (up to and including "Writing a Counter Reducer with Tests") of [Getting Started With Redux](https://egghead.io/courses/getting-started-with-redux) by Dan Abramov (author of Redux). This will recap and reinforce some of what we've already learned and give a preview of what's to come.

The whole "Getting Started With Redux" course is just over two hours but can take a while longer to work through. This will be a great series to return to as you get more familiar with Redux. There's also a [community-created set of course notes](https://github.com/tayiorbeii/egghead.io_redux_course_notes) that's a useful reference.

### Part 2: Practice with Immutable Data and Pure Functions

Write pure functions to complete the following tasks without mutating state.

```js
const arr = ['fish', 'bird', 'dog', 'monkey', 'turtle']
```

1. Add `cat` and `mouse` to the array.
2. Add 'snake' to the front of the array.
3. Delete 'monkey' from the array.

```js
const obj = {
  lastName: 'Asimov',
  occupation: 'author',
  books: ['Foundation', 'I, Robot']
}
```

4. Change occupation from 'author' to 'writer'.
5. Give the author a 'firstName' key with the value 'Isaac'.
6. Add 'Pebble in the Sky' to the array of books.


```js
let todos = [
	{todo: "learn to thrash"},
    {todo: "learn redux"},
    {todo: "hang tight"},
  	{todo: "stay loose"}
]
```

7. Give each todo a 'completed' field with value 'false'.


