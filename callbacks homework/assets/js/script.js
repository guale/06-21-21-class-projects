let num1 = NaN;
let num2 = NaN;
let operation = "";
let solution = NaN;
let hasSolution = false;

//defines the four operations the calculator is capable of performing
let calculate = {
	add(num1, num2) {
		return num1 + num2;
	},
	subtract(num1, num2) {
		return num1 - num2;
	},
	multiply(num1, num2) {
		return num1 * num2;
	},
	divide(num1, num2) {
		return num1 / num2;
	},
};

//calls the appropriate operation method to produce a result
function equal(num1, num2, operation) {
	solution = operation(num1, num2);
	hasSolution = true;
	if (solution === Infinity || isNaN(solution)){
		solution = "Undefined";
		isInvalid = true;
	}
	display.value = solution;
}

//resets all variables and displays to their initial values
function clearAll(){
	num1 = NaN;
	num2 = NaN;
	operation = "";
	solution = NaN;
	display.value = 0;
	inputOne.value = 0;
	inputTwo.value = 0;
	operationBox.value = "";
	activeBox = inputOne;
	hasSolution = false;
	isInvalid = false;
}
