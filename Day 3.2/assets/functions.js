// console.log("Script is loaded")

// let a = 1;
// let b = 2;

// function add() {
// 	return a + b;
// }

// console.log(add());

// function add2(a, b) {
// 	return a + b;
// }

// console.log(add2(7, 9));

// function addAll() {
// 	let sum = 0;
// 	for (let i = 0; i < arguments.length; i++) {
// 		sum += arguments[i];
// 	}
// 	return sum;
// }

// console.log(addAll(2, 3, 4, 5, 6, 7, 8));

// function addAll2(...rest) {
// 	let sum = 0;
// 	for (let i = 0; i < rest.length; i++) {
// 		sum += rest[i];
// 	}
// 	return sum;
// }

let billAmount = 420.69;

function gratuity() {
	return parseFloat((billAmount*.2).toFixed(2));
}

function totalWithGrat() {
	return billAmount + gratuity();
}

console.log(totalWithGrat());