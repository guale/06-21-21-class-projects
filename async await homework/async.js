async function getRandomNumber() {
	let promise = new Promise((resolve, reject) => {
		setTimeout(() => resolve(Math.random()), 500);
	});

	return await promise;
}

async function logStuff(func){
	let stuff = await func();
	console.log(stuff);
}