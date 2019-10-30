const arr = ['fish', 'bird', 'dog', 'monkey', 'turtle'];

const newArr = arr => ["snake", ...arr, "cat", "mouse"];

const holdArr = newArr(arr);

const deleteMonkey = holdArr.filter( cur => {
    if(cur != "monkey"){
       return cur
    }
})

console.log(holdArr, "<---- adding snake, cat & mouse");
console.log(deleteMonkey, "<--- deleted Monkey");

const obj = {
  lastName: 'Asimov',
  occupation: 'author',
  books: ['Foundation', 'I, Robot']
}

const changeObj = (obj) => {
    const output = {...obj, occupation: 'writer', firstName: 'Issac'};
    output.books = [...output.books, ('Pebble in the Sky')];
    return output;
}

let todos = [
	{todo: "learn to thrash"},
    {todo: "learn redux"},
    {todo: "hang tight"},
  	{todo: "stay loose"}
]

const immutable = (todos) => {
  return todos.map(cur => {
    return {...cur, completed: false}
  })
}

console.log(changeObj(obj), "<--- New Obj");
console.log(obj, "<--- Original Obj");
console.log(immutable(todos), "<-- Immutable");
console.log(todos, "<--- original todo");
