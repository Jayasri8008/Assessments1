//10. Write a JavaScript program to remove all vowels from a given string.
let str = "chinna";
let result = "";

for (let i = 0; i < str.length; i++) {
    let ch = str[i];

    if (ch !== 'a' && ch !== 'e' && ch !== 'i' && ch !== 'o' && ch !== 'u' &&
        ch !== 'A' && ch !== 'E' && ch !== 'I' && ch !== 'O' && ch !== 'U') {

        result = result+ch;
    }
}

console.log(result);
