// let username = document.getElementById("username");

// username.value = "This is a new username"

// //Get all inputs
// let inputs = document.getElementsByTagName('input');
// let inError = document.getElementsByClassName('error');

// console.log(inputs.length); //2
// console.log(inError.length); //1

// console.log("Script Loaded");

// let header = document.querySelector("header");
// console.log(header);
// let section = document.querySelectorAll("section");
// console.log(section);
// let currentSection = document.querySelector("section.current");
// console.log(currentSection);
// let afterCurrent = document.querySelector(".current").nextElementSibling;
// console.log(afterCurrent);
// let h2 = document.querySelector(".current").firstElementChild;
// console.log(h2);
// let div = document.querySelector("h2.highlight").parentElement.parentElement;
// console.log(div);
// let h2Parents = document.querySelectorAll("section:where(h2)");
// console.log(h2Parents);

/* Exercise 1 */

// let div = document.querySelector("div");
// let a = document.querySelector("a");

// console.log(a.innerHTML);
// console.log(div.innerHTML);

// a.innerHTML="Updated link text";

// console.log(a.href)

// a.name= "new link name";
// a.target="_blank";
// console.log(div.innerHTML);

/* Exercise 2 */

let list = document.querySelector("#list");

let coffeeItem = list.firstElementChild.nextElementSibling;

coffeeItem.innerHTML = "Fair Trade Coffee";

let cheezeWhiz = document.createElement("li");
cheezeWhiz.innerHTML = "Cheeze Whiz";
list.appendChild(cheezeWhiz);

list.innerHTML = "";

let newList = ["protein powder","muscle milk","power bars"];

newList.map(function(listItem){
	let newItem = document.createElement("li");
	newItem.innerHTML = listItem;
	list.appendChild(newItem)
})

let muscleMilk = list.children[2];
muscleMilk.classList += "important";