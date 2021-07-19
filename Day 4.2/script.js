class fruit {
	constructor(name){
		this.name = name;
	}
	speak = function(){
		console.log("Hey my name is " + this.name)
	}
}

let apple = new fruit("Apple");
let banan = new fruit("Banana")

apple.speak();
banan.speak();
