const calculator = document.querySelector("#calculator");
const keys = calculator.querySelector("#buttonBox");
const equalKey = keys.querySelector("#equal");

const inputOne = calculator.querySelector("#inputOneBox");
const inputTwo = calculator.querySelector("#inputTwoBox");
const operationBox = calculator.querySelector("#operationBox");
const display = calculator.querySelector("#displayBox");

let activeBox = inputOne; //used to select which input box the input is entered into

let hasDecimal = false; //used to determine if the current box has a decimal already and does not add decimal if true
let isInvalid = false; //used to handle invalid solutions i.e. infinity and NaN

keys.addEventListener("click", (e) => {
	if (e.target.matches("button")) {
		const key = e.target;
		const action = key.dataset.action;
		const keyClass = key.className;

		//if the key pressed has no action it is a number key. appends the number to the proper input box as a string
		if (!action) {
			//if a solution already exists clears all of the inputs to allow entering a new number
			if (hasSolution) {
				clearAll();
			}
			//if the active box displays a 0 the current value is replaced
			if (activeBox.value === "0") {
				activeBox.value = key.innerText;
			} else {
				activeBox.value += key.innerText;
			}
		}

		if (action == "decimal") {
			if (hasSolution) {
				clearAll();
			}
			//if the active box has a value of 0 then a decimal will be appended to the 0
			if (activeBox.value === "0") {
				activeBox.value += ".";
				hasDecimal = true;
				console.log(hasDecimal);
			}
			if (activeBox.value !== "0" && !hasDecimal) {
				activeBox.value += ".";
				hasDecimal = true;
			}
		}

		if (keyClass == "operation") {
			//if an invalid solution exists operation keys are treated as clearAll to prevent further math from being done on an invalid solution
			if (isInvalid) {
				clearAll();
			} else {
				//if a solution already exists, moves the solution to inputOne and runs clearAll to allow a new operation to be performed on the solution
				if (hasSolution) {
					let storedSolution = solution;
					clearAll();
					inputOne.value = storedSolution;
				}
				//if inputOne is the active box, selects the operation and changes activeBox to inputTwo
				if (activeBox == inputOne) {
					num1 = parseFloat(inputOne.value);
					operation = action;
					hasDecimal = false;
					operationBox.value = key.innerText;
					activeBox = inputTwo;
				}
				//if inputTwo is the active box, performs the previously selected operation and places the solution into inputOne and selects the new operation
				else if (activeBox == inputTwo) {
					equalKey.click();
					let storedSolution = solution;
					clearAll();
					inputOne.value = storedSolution;
					key.click();
				}
			}
		}

		// feeds the appropriate operation and numbers to the equal function
		if (action == "calculate") {
			if (operation) {
				num2 = parseFloat(inputTwo.value);
				switch (operation) {
					case "add":
						equal(num1, num2, calculate.add);
						break;
					case "subtract":
						equal(num1, num2, calculate.subtract);
						break;
					case "multiply":
						equal(num1, num2, calculate.multiply);
						break;
					case "divide":
						equal(num1, num2, calculate.divide);
						break;
				}
			}
		}

		//resets all variables and displays to their initial values
		if (action == "clear") {
			clearAll();
		}
	}
});
