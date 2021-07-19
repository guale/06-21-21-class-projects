// // function add(number1, number2) {
// // 	return 1 + 2;
// // }

// // function doMath(operation, number1, number2) {
// // 	return operation(number1, number2);
// // }

// // let sum = doMath(add, 1, 2);

// // console.log(sum);

// let students = [
// 	{firstName:"Cam", lastName:"Newton"},
// 	{firstName:"Ted", lastName:"Ginn"},
// 	{firstName:"Greg", lastName:"Olsen"},
// ]

// let fullNames=students.map(function(student){
// 	return `${student.firstName} ${student.lastName}`
// })

// console.log(fullNames)

/* Challenge 1 */
{
// 	// let superHeroes = [
// 	// 	["Batman", "Bruce Wayne"],
// 	// 	["Spiderman", "Peter Parker"],
// 	// 	["The Flash", "Barry Allen"]
// 	// ];
// 	// let secretIdentity = superHeroes.map(function (revealArray) {
// 	// 	return revealArray.join(" is ");
// 	// });
// 	// console.log(secretIdentity.join("\n"));
}

/* Challenge 2 */
{
// 	let players = [
// 		{
// 			firstName: "Cam",
// 			lastName: "Newton",
// 			position: "QB",
// 			touchdowns: 32,
// 		},
// 		{
// 			firstName: "Derek",
// 			lastName: "Anderson",
// 			position: "QB",
// 			touchdowns: 0,
// 		},
// 		{
// 			firstName: "Jonathan",
// 			lastName: "Stewart",
// 			position: "RB",
// 			touchdowns: 12,
// 		},
// 		{
// 			firstName: "Mike",
// 			lastName: "Tolbert",
// 			position: "RB",
// 			touchdowns: 8,
// 		},
// 		{
// 			firstName: "Fozzy",
// 			lastName: "Whittaker",
// 			position: "RB",
// 			touchdowns: 3,
// 		},
// 		{ firstName: "Ted", lastName: "Ginn", position: "WR", touchdowns: 9 },
// 		{
// 			firstName: "Devin",
// 			lastName: "Funchess",
// 			position: "WR",
// 			touchdowns: 2,
// 		},
// 	];

// 	let playerMike = players.find(function (player) {
// 		return (player.firstName = "Mike");
// 	});
// 	console.log(playerMike);

// 	let playerRB = players.filter(function (player) {
// 		return (player.position === "RB");
// 	});
// 	console.log(playerRB);

// 	let playerLastName = players.map(function(player){
// 		return player.lastName
// 	})
// 	console.log(playerLastName)

// 	let bestRB = players.filter(function(player){
// 		return 
// 	})
}


let myButton = document.getElementById("myButton");

myButton.addEventListener('click', function(){
	alert('click');
})

let students = [
	{ name: "Edwin"}, 
	{ name: "Kim"}, 
	{ name: "Skip"}
  ];
  
  let names = students.map((student) => student.name);
  
  console.log(names);
  // ["Edwin","Kim","Skip"]