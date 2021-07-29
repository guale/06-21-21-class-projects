// const promiseA = new Promise((resolve, reject) => {
// 	let x = 2000;
// 	if (x == 200) {
// 		resolve(x);
// 	} else {
// 		reject(x);
// 	}
// });

// promiseA.then(
// 	(val) => console.log("Async logging has value: " + val),
// 	(err) => console.log("Error: " + err)
// );

// console.log("This is the immediate log");

// async function timedAction() {
// 	let promise = new Promise((resolve, reject) => {
// 		setTimeout(() => resolve("done"), 2000);
// 	});

// 	let result = await promise;

// 	alert(result);
// }

// timedAction();

let url = "https://javascript.info/article/promise-chaining/user.json";
// let options = "GET";
let response = fetch(url);

async function getStuff(){
	let response = await fetch(url);

	if(response.ok){
		let json = await response.json();
	} else {
		alert("HTTP-Error: "+response.status);
	}
}
