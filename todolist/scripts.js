let input = document.querySelector("input");
let list = document.querySelector("ul");
let add = document.querySelector("#addBtn");
let clear = document.querySelector("#clearBtn");


add.addEventListener("click",addLI);
clear.addEventListener("click",clearList);

function addLI(){
	let newLI = document.createElement("li");
	newLI.innerText=input.value;
	newLI.addEventListener("click",removeLI);
	list.appendChild(newLI);
	input.value = "";
}

function removeLI(e){
	let item = e.target;
	item.className = "remove";
	setTimeout(function(){
		item.remove();
	}, 1000)
}

function clearList(){
	list.innerHTML="";
}