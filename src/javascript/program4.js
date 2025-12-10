//4. Write a JavaScript program to find the largest of three numbers.

let a = 10;
let b = 25;
let c = 15;

let largest;

if (a >= b && a >= c) {
    largest = a;
}
else if (b >= a && b >= c) {
    largest = b;
}
else {
    largest = c;
}

console.log("Largest number is: " + largest);
