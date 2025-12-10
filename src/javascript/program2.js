//2. Write a JavaScript program to reverse a string without using the reverse() method.
let str = "hello";
let reversed = "";

for (let i = str.length - 1; i >= 0; i--) {
    reversed += str[i];
}

console.log("Reversed string:", reversed);
