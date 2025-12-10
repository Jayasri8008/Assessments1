//8. Write a JavaScript program to find all duplicate elements in an array.
let arr = [1, 2, 3, 2, 4, 5, 1];

for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
        if (arr[i] === arr[j]) {
            console.log("Duplicate:", arr[i]);
        }
    }
}
