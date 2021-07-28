let postTitle = document.querySelector("#postTitle");
let postBody = document.querySelector("#postBody");

let postData;

fetch("https://jsonplaceholder.typicode.com/posts/1")
	.then((response) => response.json())
	.then((json) => {
		postData = json;
		console.log(json);
		postTitle.innerText = postData.title;
		postBody.innerText = postData.body;
	});

